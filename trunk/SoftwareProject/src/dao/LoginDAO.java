package dao;

import source.Login;
import java.sql.*;

public class LoginDAO {

    private static String username ="SP2_gr5";
    private static String password ="9RVU";
    private static String username1, passw1;
    private static Login logUserIn;

    private static String connectionString = "jdbc:mysql://dt5.ehb.be/SP2_gr5";
    private static java.sql.Connection connection;
    private static Statement command;
    private static  ResultSet data;

    public static String getUserName(String user){

        try {
            data =  Connection.executeQueryString("Select username from user where username =" + user);
            if(data == null) throw new SQLException("Statement not executed");
            else  System.out.println("Executed.");
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
                    return user;
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
        return username;
    }

    public static String getWachtwoord(String user){
        String pass=" ";
        try {
            connection = DriverManager.getConnection(connectionString, username, password);
            command = connection.createStatement();

            command.execute("Select password from user where username='"+user+"';");
            data=command.getResultSet();
            //command.execute("DELETE FROM EMPLOYEE WHERE first_name = 's'");
            System.out.println("Executed.");


        }catch (SQLException e){
            e.printStackTrace();
        } finally{
            try {
                if (data.first()) {

                    System.out.println("getting data");
                    pass=data.getString(1);
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
        if (connection!=null)
        {
            try {
                connection.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return pass;
    }



    public static Login getLoginDetails(String user)
    {
        try {
            connection = DriverManager.getConnection(connectionString, username, password);
            command = connection.createStatement();
            if( command.execute("Select wachtwoord from user where username='"+user+"'"))
            {
                data=command.getResultSet();
            }
            //command.execute("DELETE FROM EMPLOYEE WHERE first_name = 's'");
            System.out.println("Executed.");

            connection.close();
        }catch (SQLException e){
            System.out.println(e);
            e.printStackTrace();
        } finally{
            try {
                if (data.first()) {

                    logUserIn = new Login(data.getInt(1),
                            data.getInt(2),data.getString(3),data.getString(4),
                            data.getString(5),data.getString(6),data.getInt(7));
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
        return null;
    }

    public static boolean updateLogin(Login login, String user, String password)
    {
        if(user != null && password != null){
            return Connection.executeString("UPDATE user SET username =" + user + ", password = " + password + "WHERE username =" + login.getUser());
        }else{
            if(user != null){
                return Connection.executeString("UPDATE user SET username =" + user + "WHERE username =" + login.getUser());
            }
            if(password != null){
                return Connection.executeString("UPDATE user SET password =" + password + "WHERE username =" + login.getUser());
            }
        }
        return false;
    }
}



