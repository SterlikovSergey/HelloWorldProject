package by.sterlikov.homework.lesson20sql;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class MySqlExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test_db";
        String login = "root";
        String password = "root";
        try (Connection connection = DriverManager.getConnection(url, login, password)) {
            connection.setAutoCommit(false);
            Statement statement = connection.createStatement();
            statement.execute(
                    "CREATE TABLE IF NOT EXISTS STUDENT(" +
                            "ID INT PRIMARY KEY NOT NULL," +
                            "NAME VARCHAR(50) NOT NULL," +
                            "AGE INT NOT NULL," +
                            "CITY_ID INT)"
            );
            statement.execute(
                    "CREATE TABLE IF NOT EXISTS CITY(" +
                            "ID INT PRIMARY KEY NOT NULL," +
                            "CITY_NAME VARCHAR(50))"
            );
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

            String queryAllStudents = "SELECT * FROM STUDENT";
            ResultSet resultSet = statement.executeQuery(queryAllStudents);
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
            // examination
            students.stream()
                    .distinct()
                    .forEach(System.out::println);

            String queryAllCity = "SELECT * FROM CITY";
            ResultSet resultSetCity = statement.executeQuery(queryAllCity);
            List<City> cities = new ArrayList<>();
            while ((resultSetCity.next())) {
                int id;
                String city_name;
                id = resultSetCity.getInt("ID");
                city_name = resultSetCity.getString("CITY_NAME");
                City citiesClass = new City(id, city_name);
                cities.add(citiesClass);
            }
            // examination
            cities.stream()
                    .distinct()
                    .forEach(System.out::println);

            /*String queryJoin = "SELECT NAME,AGE,CITY_NAME\n" +
                    "FROM STUDENT S\n" +
                    "INNER JOIN CITY C on S.CITY_ID = C.ID";*/
            PreparedStatement joinResulSet = connection.prepareStatement("SELECT NAME,AGE,CITY_NAME\n" +
                    "    FROM STUDENT S\n" +
                    "INNER JOIN CITY C on S.CITY_ID = C.ID");
            //  .executeQuery();
            ResultSet resultJoinQuery = joinResulSet.executeQuery();
            connection.commit();

            while (resultJoinQuery.next()) {
                System.out.println(
                        resultJoinQuery.getString("NAME") + " " +
                                resultJoinQuery.getInt("AGE") + " " +
                                resultJoinQuery.getString("CITY_NAME")
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
