package main;

import java.sql.*;

public class Info {

	
	public static void main(String args[]) {
		try{ 
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection con = 
			DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommercehubdb","root",""); 
			Statement stmt=con.createStatement(); 
			ResultSet rs=stmt.executeQuery("select * from Orders"); 
			while(rs.next())
			{
			System.out.println("Order ID: " + rs.getInt(1) + " Order Date: " + rs.getString(2) + " Total Amount: " + rs.getString(3) + " Order Status" + rs.getString(4));
			}
			con.close(); 
			
			} catch(Exception e)
			{
			System.out.println(e);
			}


}
}
