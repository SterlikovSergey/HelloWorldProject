package by.sterlikov.classwork.lesson20sql;

import java.sql.*;

public class MySqlExample {
    public static void main(String[] args) {
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db","root","root")){
            connection.setAutoCommit(false);// не выполнит  sql запрос ниже пока false

            connection.prepareStatement("INSERT INTO DEVELOPERS(NAME, POSITION, AGE)\n" +
                    "VALUES ('Viktor','BA',43),\n" +
                    "       ('Stefan','BA',41),\n" +
                    "       ('Irina','BA',35);").execute();// когда не важен результат

/*            ResultSet rs = connection.prepareStatement("select * from DEVELOPERS where ID = 2")
                    .executeQuery();*/


            PreparedStatement ps = connection.prepareStatement("select * from DEVELOPERS where ID = ?");// как строку
            ps.setInt(1,1); // исключить  sql иньекцию
            ResultSet rs = ps.executeQuery();
                    //.executeQuery();

            connection.commit();//  принять изменения между connection.setAutoCommit(false); и connection.commit();
            //connection.rollback();// убирает  всё что не сохранилось

            while (rs.next()){
                System.out.println(rs.getInt("ID") + " " +
                        rs.getString("NAME") + " " +
                        rs.getInt("AGE"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
