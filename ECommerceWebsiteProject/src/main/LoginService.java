package main;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginService {

	public boolean login(String email, String password) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommercehubdb", "root", "");

            PreparedStatement statement = con.prepareStatement("SELECT * FROM Users WHERE Email = ? AND Password = ?");
            statement.setString(1, email);
            statement.setString(2, password);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
              
                System.out.println("Login successful");
                return true;
                
            } else {
                 System.out.println("User Not Found");
                 return false;

             	
            }

     

        } catch (Exception e) {
        	System.out.println(e);
            return false; 
        }
    }
}
