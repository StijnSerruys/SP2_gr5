package connect;

import java.sql.*;

public class Connection {

    private static String username = "SP2_gr5";
    private static String password = "9RVU";

    private static String connectionString = "jdbc:mysql://dt5.ehb.be/SP2_gr5";
    private static java.sql.Connection connection;
    private static Statement command;
    private static ResultSet data;

    public static void main(String[] args){
        try {
            if(connection == null) {
                connection = DriverManager.getConnection(connectionString, username, password);
                command = connection.createStatement();
                //command.execute("INSERT INTO EMPLOYEE VALUES (2, 'S', 'Se', 1500)");
                data = command.executeQuery("SELECT * FROM EMPLOYEE");
                //command.execute("DELETE FROM EMPLOYEE WHERE first_name = 's'");
            }
            //System.out.println("Connection? " + connection + ", Closed? " + command.isClosed());
        }catch (SQLException e){
            e.printStackTrace();
        } finally{
            try {
                if (data != null) {
                    while (data.next()) {
                        System.out.println("nr= " + data.getString("id") + ", name= " + data.getString("first_name"));
                    }
                }
                if(connection != null){
                   connection.close();
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }
}

