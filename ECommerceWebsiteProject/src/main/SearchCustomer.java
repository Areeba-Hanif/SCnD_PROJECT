package main;

import java.sql.*;

public class SearchCustomer {
	
	public String searchCustomerInfo(String CustomerID) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommercehubdb","root","");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from customers inner join accounts on customers.CustomerID = accounts.CustomerID where customers.CustomerID='"+CustomerID+"';");
			
			while(rs.next())
			{
				String CustomerInformation = "ID: " + rs.getString(1) + "," + " Name: " + rs.getString(2) + " " + rs.getString(3) + "," + " Email: " + rs.getString(4) + "," + " PhoneNumber: " 
				+ rs.getInt(5) + "," + " Address: " + rs.getString(6) + "," + " Gender: " + rs.getString(7) + ","  + " Status: " + rs.getString(8) + "," + " AccountCreationDate: " + rs.getDate(11)
				+ "," + " PaymentMethod: " + rs.getString(12);
			
			con.close();
			
			return CustomerInformation;
			} 
		}
		
			catch(Exception e)
			{
			
				System.out.println(e);
			}
		
		return "";
	}

}
