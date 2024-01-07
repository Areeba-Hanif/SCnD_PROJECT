package ecommerceWebsite;

import java.sql.*;

public class CustomerStatus {

	public String getCustomerStatus(String customerId) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommercedb", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from customers inner join accounts on customers.CustomerID = accounts.CustomerID where customers.CustomerID ='" + customerId + "'");

            String status = "";

            while (rs.next()) {
                status = "ID: " + rs.getString(1) + "," + " Name: " + rs.getString(2) + " " + rs.getString(3) + ","  + " Status: " + rs.getString(8);
            }

            if (status.isEmpty()) {
                System.out.println("Customer with ID " + customerId + " not found.");
            }

            con.close();

            return status;

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return "";
    }
	
}
