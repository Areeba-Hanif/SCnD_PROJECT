package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Information {

	public RetrieveOrderInformation getOrderInformation(int OrderID) {
		try{ 
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection con = 
			DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommercehubdb","root",""); 
			Statement stmt=con.createStatement(); 
			ResultSet rs=stmt.executeQuery("select * from Orders where Orders.OrderID="+OrderID+ ";"); 
			rs.next();
		
			RetrieveOrderInformation OrderInfo = new RetrieveOrderInformation(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
			con.close(); 
		
			return OrderInfo;
		
			} catch(Exception e)
			{
			System.out.println(e);
			}
		
		return null;
	}
}



