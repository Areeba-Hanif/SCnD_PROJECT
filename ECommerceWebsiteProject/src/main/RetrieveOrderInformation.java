package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrieveOrderInformation {

    public Order getOrderInformation(int orderId) {
    	
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommercehubdb", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Orders where OrderID = " + orderId);

            if (rs.next()) {
                Order orderInfo = new Order(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
                con.close();
                return orderInfo;
            } else {
                System.out.println("Order not found. Invalid ID.");
            }
            
        } catch (Exception e) {
        	System.out.println(e);
        }

        return null; 
    }
}
