package main;

import java.sql.*;

public class ecommerce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommercehubdb","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT users.UserID,users.Username,users.OrderID,"
					+ "payment.PaymentAmount FROM users,payment WHERE users.OrderID=payment.OrderID\r\n" + 
					"");  
			while(rs.next()) 
			{ 
			System.out.println("UserID: " + rs.getString(1) + " UserName: " + rs.getString(2) + " OrderID: "  
			+ rs.getInt(3) + "Payment Amount: " + rs.getInt(4)); 
			} 
			con.close();  
			} catch(Exception e) 
			{ 
			System.out.println(e); 
			}

	}

}
