package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SignupService {
	
	public boolean signUp(String username, String password,String email) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommercehubdb", "root", "");

          
            PreparedStatement checkStatement = con.prepareStatement("SELECT * FROM Users WHERE Username = ?");
            checkStatement.setString(1, username);
            ResultSet resultSet = checkStatement.executeQuery();

            if (resultSet.next()) {
                con.close();
                System.out.println("User is Already Registered");
                return false;
            }

           
            PreparedStatement insertStatement = con.prepareStatement("INSERT INTO Users (Username, Password,Email) VALUES (?, ?, ?)");
            insertStatement.setString(1, username);
            insertStatement.setString(2, password);
            insertStatement.setString(3, email);
            insertStatement.executeUpdate();

            con.close();
            System.out.println("User Registered Successfully");
            return true; 

        } catch (Exception e) {
        	System.out.println(e);
            return false; 
        }
    }


}
