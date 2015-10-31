package dao;

import source.Login;
import java.sql.*;

public class LoginDAO {
    private static String username1, password1;
    private static Login logUserIn;

    private static java.sql.Connection connection;
    private static Statement command;
    private static ResultSet data;
    private static PreparedStatement stmt = null;

    public static String getUserName(String user){

        try {
            connection = Connection.getDBConnection();
            command = connection.createStatement();

            System.out.println("Creating statement...");
            stmt = connection.prepareStatement("SELECT username FROM user WHERE username = ?");
            stmt.setString(1, user);
            data = stmt.executeQuery();

            while(data.next()){
            System.out.println("getting data");
            username1=data.getString(1);
        }
        data.close();
        stmt.close();
        connection.close();
    }catch (SQLException e){
        e.printStackTrace();
    }catch(Exception e) {//Handle errors for Class.forName
        e.printStackTrace();
    }finally{
        try{
            if(stmt!=null)  stmt.close();
        }catch(SQLException se2){
            se2.printStackTrace();
        }
        try{
            if(connection!=null) connection.close();
        }catch(SQLException se){
            se.printStackTrace();
        }
    }
        return username1;
    }

    public static String getWachtwoord(String user){
        try {
            connection = Connection.getDBConnection();
            command = connection.createStatement();

            stmt = connection.prepareStatement("Select password from user where username=?");
            stmt.setString(1, user);
            data = stmt.executeQuery();

            while(data.next()){
                System.out.println("getting data");
                password1=data.getString(1);
            }
            data.close();
            stmt.close();
            connection.close();
        }catch (SQLException e){
            e.printStackTrace();
        }catch(Exception e) {//Handle errors for Class.forName
            e.printStackTrace();
        }finally{
            try{
                if(stmt!=null)  stmt.close();
            }catch(SQLException se2){
                se2.printStackTrace();
            }
            try{
                if(connection!=null) connection.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
        return password1;
    }

/*    public static Login getLoginDetails(String user)
    {
        try {
            connection = DriverManager.getConnection(connectionString, username, password);
            command = connection.createStatement();
            if( command.execute("Select wachtwoord from user where username='"+user+"'"))
            {
                data=command.getResultSet();
            }
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
    }*/
}



