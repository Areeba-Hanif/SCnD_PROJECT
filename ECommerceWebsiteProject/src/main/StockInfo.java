package main;

import java.sql.*;

public class StockInfo {

	public String getStockInformation(String ProductName)
	{
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommercehubdb","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT stock.Quantity FROM warehouse,warehousestock,categories,"
					+ "products,stock WHERE products.ProductID=warehouse.ProductID and "
					+ "categories.StockID=warehousestock.StockID and ProductName='"+ProductName+"'\r\n" + 
					""); 
			
			rs.next();
			
			String StockInfo = " Product Quantity: " + rs.getInt(1); 
			
			con.close();  
			
			return StockInfo;
			
			} catch(Exception e) 
			{ 
			System.out.println(e); 
			}


		return "" ;
	}
}
