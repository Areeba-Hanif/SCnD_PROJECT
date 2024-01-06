package main;

import java.sql.*;

public class information {

	public String getStockInformation(String ProductName)
	{
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommercehubdb","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT products.ProductName,products.Price,stock.Quantity,"
					+ "warehousestock.StockID FROM warehousestock,warehouse,products,stock WHERE "
					+ "products.ProductID=warehouse.ProductID and stock.StockID=warehousestock.StockID "
					+ "and ProductName='"+ProductName+"'\r\n" + 
					""); 
			
			while(rs.next())
			{
			String StockInfo = "ProductName: " + rs.getString(1) + " Price: " + rs.getInt(2) + " Quantity: "  
			+ rs.getInt(3) + " StockID: " + rs.getInt(4); 
			
			con.close();  
			
			return StockInfo;
			}
			} catch(Exception e) 
			{ 
			System.out.println(e); 
			}


		return "" ;
	}
}
