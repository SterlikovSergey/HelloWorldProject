package by.sterlikov.classwork.lesson20sql;

import java.sql.*;

public class MySqlExample {
    private final static String INSERT_QUERY = "INSERT INTO DEVELOPERS (NAME, POSITION, AGE) " +
            "VALUES ('Viktor','BA',43),('Stefan','BA',41),('Irina','BA',35)";
    private final static String SELECT_QUERY = "SELECT * FROM DEVELOPERS WHERE ID = 2";
    public static void main(String[] args) {
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db","root","root")){
            connection.setAutoCommit(false);// не выполнит  sql запрос ниже пока false
            connection.prepareStatement(INSERT_QUERY).execute();// когда не важен результат
            ResultSet resultSet = connection.prepareStatement(SELECT_QUERY)
                    .executeQuery();


            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_QUERY);// как строку
            preparedStatement.setInt(1,1); // исключить  sql иньекцию
            ResultSet resultSet1 = preparedStatement.executeQuery();


            connection.commit();//  принять изменения между connection.setAutoCommit(false); и connection.commit();
            //connection.rollback();// убирает  всё что не сохранилось

            while (resultSet1.next()){
                System.out.println(resultSet1.getInt("ID") + " " +
                        resultSet1.getString("NAME") + " " +
                        resultSet1.getInt("AGE"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
