package by.sterlikov.homework.lesson20sql;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MySqlExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test_db";
        String login = "root";
        String password = "root";

        while (true) {
            try (Connection connection = DriverManager.getConnection(url, login, password)) {
                Scanner scanner = new Scanner(System.in);
                Statement statement = connection.createStatement();
                System.out.println(
                        "press 1 to create table students" +
                        "\npress 2 to create table cities" +
                        "\npress 3 to insert value students" +
                        "\npress 4 to insert value cities" +
                        "\npress 5 to printing table of students from city" +
                        "\npress 6 to exit "
                );
                switch (scanner.nextInt()){
                    case 1: createOfTableStudent(statement);
                    case 2: createOfTableCity(statement);
                    case 3: insertValuesOfStudent(statement);
                    case 4: insertValuesOfCity(statement);
                    case 5: printingStudentsFromCity(connection);
                }

                List<Student> students = getStudents(statement);
                List<City> cities = getCities(statement);

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static void insertValuesOfCity(Statement statement) throws SQLException {
        statement.execute(
                "INSERT INTO CITY(CITY_NAME) " +
                        "VALUES " +
                        "('Minsk')," +
                        "('London')," +
                        "('Paris')," +
                        "('New York')," +
                        "('Madrid')," +
                        "('Brest')," +
                        "('Rim');"
        );
    }

    private static void insertValuesOfStudent(Statement statement) throws SQLException {
        statement.execute(
                "INSERT INTO STUDENT(NAME,AGE,CITY_ID)" +
                "VALUES " +
                "('Sergey',38,1)," +
                "('Sasha',25,7)," +
                "('Nataly',30,1)," +
                "('Aleksandra',35,2)," +
                "('Valentina',25,3)," +
                "('Tanya',24,4)," +
                "('Nick',29,5)," +
                "('Andrey',39,5)," +
                "('Nataly',35,1)," +
                "('Max',42,5)," +
                "('Olga',40,2)," +
                "('Irina',36,6);"
        );
    }

    private static void createOfTableCity(Statement statement) throws SQLException {
        statement.execute(
                "CREATE TABLE IF NOT EXISTS CITY(" +
                        "ID INT PRIMARY KEY NOT NULL," +
                        "CITY_NAME VARCHAR(50))"
        );
    }

    private static void createOfTableStudent(Statement statement) throws SQLException {
        statement.execute(
                "CREATE TABLE IF NOT EXISTS STUDENT(" +
                        "ID INT PRIMARY KEY NOT NULL," +
                        "NAME VARCHAR(50) NOT NULL," +
                        "AGE INT NOT NULL," +
                        "CITY_ID INT)"
        );
    }

    private static void printingStudentsFromCity(Connection connection) throws SQLException {
        PreparedStatement joinResulSet = connection.prepareStatement("SELECT NAME,AGE,CITY_NAME\n" +
                "    FROM STUDENT S\n" +
                "INNER JOIN CITY C on S.CITY_ID = C.ID");
        ResultSet resultJoinQuery = joinResulSet.executeQuery();
        while (resultJoinQuery.next()) {
            System.out.println(
                    resultJoinQuery.getString("NAME") + " " +
                            resultJoinQuery.getInt("AGE") + " " +
                            resultJoinQuery.getString("CITY_NAME")
            );
        }
    }

    private static List<City> getCities(Statement statement) throws SQLException {
        ResultSet resultSetCity = statement.executeQuery("SELECT * FROM CITY");
        List<City> cities = new ArrayList<>();
        while ((resultSetCity.next())) {
            int id;
            String city_name;
            id = resultSetCity.getInt("ID");
            city_name = resultSetCity.getString("CITY_NAME");
            City citiesClass = new City(id, city_name);
            cities.add(citiesClass);
        }
        return cities;
    }

    private static List<Student> getStudents(Statement statement) throws SQLException {
        ResultSet resultSet = statement.executeQuery("SELECT * FROM STUDENT");
        List<Student> students = new ArrayList<>();
        while ((resultSet.next())) {
            int id;
            String name;
            int age;
            int city_id;
            id = resultSet.getInt("ID");
            name = resultSet.getString("NAME");
            age = resultSet.getInt("AGE");
            city_id = resultSet.getInt("CITY_ID");
            Student studentsClass = new Student(id, name, age, city_id);
            students.add(studentsClass);
        }
        return students;
    }
}
