package logins;

import java.sql.*;
import logins.*;

public class LoginDAO {

    private static String username = "SP2_gr5";
    private static String password = "9RVU";

    private static String connectionString = "jdbc:mysql://dt5.ehb.be/SP2_gr5";
    private static java.sql.Connection connection;
    private static Statement command;
    private static  ResultSet data;

    public static String getUserName(String username){
        try {
            connection = DriverManager.getConnection(connectionString, username, password);
            command = connection.createStatement();
            command.execute("Select username from users where username ="+username);
            //command.execute("DELETE FROM EMPLOYEE WHERE first_name = 's'");
            System.out.println("Executed.");
            connection.close();
        }catch (SQLException e){
            System.out.println(e);
            e.printStackTrace();
        } finally{
            try {
                if (data.first()) {
                    while (data.next()) {
                        System.out.println("name= " + data.getString(2) + "");
                        String username1 = data.getString(1);
                        
                    }
                }
                return username;
            }catch(SQLException e){
                    e.printStackTrace();
            }
        }
    }
    
    public static String getWachtwoord(String username){
        try {
            connection = DriverManager.getConnection(connectionString, username, password);
            command = connection.createStatement();
            command.execute("Select wachtwoord from users where username="+username);
            //command.execute("DELETE FROM EMPLOYEE WHERE first_name = 's'");
            System.out.println("Executed.");
            connection.close();
        }catch (SQLException e){
            System.out.println(e);
            e.printStackTrace();
        } finally{
            try {
                if (data.first()) {
                    while (data.next()) {
                      return data.getString(2);
                    }
                }
            }catch(SQLException e){
                    e.printStackTrace();
            }
        }
    }
    public static Login getLoginDetails(String username)
    {
    	try {
            connection = DriverManager.getConnection(connectionString, username, password);
            command = connection.createStatement();
            command.execute("Select wachtwoord from users where username="+username);
            //command.execute("DELETE FROM EMPLOYEE WHERE first_name = 's'");
            System.out.println("Executed.");
            connection.close();
        }catch (SQLException e){
            System.out.println(e);
            e.printStackTrace();
        } finally{
            try {
                if (data.first()) {
                    while (data.next()) {
                      Login logUserIn= new Login(data.getInt(1),
                    		  data.getInt(2),data.getString(3),data.getString(4),
                    		  data.getString(5),data.getString(6),data.getInt(7));
                    }
                }
            }catch(SQLException e){
                    e.printStackTrace();
            }
        }
    	
    	
    }
    

}

