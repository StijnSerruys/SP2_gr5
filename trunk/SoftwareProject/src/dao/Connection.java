package dao;

//import logins.*;
import java.sql.*;

public class Connection {

    private static String username = "SP2_gr5";
    private static String password = "9RVU";

    private static String connectionString = "jdbc:mysql://dt5.ehb.be/SP2_gr5";
    private static java.sql.Connection connection;
    private static Statement command;
    private static ResultSet data;

   /* public static void main(String[] args){
        System.out.println("Controller connection");
        try {
            if(connection == null) {
                connection = DriverManager.getConnection(connectionString, username, password);
                command = connection.createStatement();

            }
            //command.execute("INSERT INTO user VALUES (2, 'S', 'Se', 1500)");
            data = command.executeQuery("SELECT * FROM user");
            //command.execute("DELETE FROM user WHERE first_name = 's'");
            System.out.println("Connection? " + connection + ", Closed? " + connection.isClosed());
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
    }*/

    public static boolean executeString(String executestring){
        try {
            if(connection == null) {
                connection = DriverManager.getConnection(connectionString, username, password);
                command = connection.createStatement();

            }
            command.execute(executestring);
            System.out.println("Connection? " + connection + ", Closed? " + connection.isClosed());
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        } finally{
            try {
                if (data != null) {
                    System.out.println("DATA IS NIET NULL ??? ! ----- ");
                }
                if(connection != null){
                    connection.close();
                }
            }catch(SQLException e){
                e.printStackTrace();
                return false;
            }
        }
        System.out.println("Geeft commnd door! ----- ");
        return true;
    }

    public static ResultSet executeQueryString(String executeQuery){
        try {
            if(connection == null) {
                connection = DriverManager.getConnection(connectionString, username, password);
                command = connection.createStatement();
            }
            data = command.executeQuery(executeQuery);
            System.out.println("Connection? " + connection + ", Closed? " + connection.isClosed());
        }catch (SQLException e){
            e.printStackTrace();
        } finally{
            try {
                if (data != null) {
                    while (data.next()) {
                        System.out.println("PRINT DATA executeQueryString.. -----");
                        //System.out.println("nr= " + data.getString(resultColumns[0]) + ", name= " + data.getString(resultColumns[1]));
                    }
                }else{
                    System.out.println("No data received back from resultset.");
                }
                if(connection != null){
                    connection.close();
                    System.out.println("Connection? " + connection + ", Closed? " + connection.isClosed());
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
        return data;
    }
}

