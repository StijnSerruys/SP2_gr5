package logins;

import java.sql.*;

public class LoginDAO {

    private static String username = "SP2_gr5";
    private static String password = "9RVU";
    private static String username1, passw1;
    private static Login logUserIn;

    private static String connectionString = "jdbc:mysql://dt5.ehb.be/SP2_gr5";
    private static java.sql.Connection connection;
    private static Statement command;
    private static  ResultSet data;

    public static String getUserName(String username){
        try {
            connection = DriverManager.getConnection(connectionString, username, password);
            command = connection.createStatement();
            command.executeQuery("Select username from users where username =" + username);
            System.out.println("getUserName Executed.");
            connection.close();
        }catch (SQLException e){
            System.out.println(e);
            e.printStackTrace();
        } finally{
            try {
                if (data.first()) {
                    while (data.next()) {
                        System.out.println("name= " + data.getString(2) + "");
                        username1 = data.getString(1);
                        
                    }
                }

            }catch(SQLException e){
                    e.printStackTrace();
            }
        }
        return username1;
    }
    
    public static String getWachtwoord(String username){
        try {
            connection = DriverManager.getConnection(connectionString, username, password);
            command = connection.createStatement();
            command.executeQuery("Select wachtwoord from users where username=" + username);
            System.out.println("getWachtwoord Executed.");
            connection.close();
        }catch (SQLException e){
            System.out.println(e);
            e.printStackTrace();
        } finally{
            try {
                if (data.first()) {
                    while (data.next()) {
                        passw1 = data.getString(2);
                    }
                }
            }catch(SQLException e){
                    e.printStackTrace();
            }
        }
        return passw1;
    }
    public static Login getLoginDetails(String username)
    {

    	try {
            connection = DriverManager.getConnection(connectionString, username, password);
            command = connection.createStatement();
            command.executeQuery("Select wachtwoord from users where username=" + username);
            System.out.println("getLoginDetails Executed.");
            connection.close();
        }catch (SQLException e){
            System.out.println(e);
            e.printStackTrace();
        } finally{
            try {
                if (data.first()) {
                    while (data.next()) {
                      logUserIn = new Login(data.getInt(1),
                    		  data.getInt(2),data.getString(3),data.getString(4),
                    		  data.getString(5),data.getString(6),data.getInt(7));
                    }
                }
            }catch(SQLException e){
                    e.printStackTrace();
            }
        }
    	return logUserIn;
    }
}

