
package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertOrderInformation {

    public static String setOrderInformation(String orderDate, String totalAmount, String orderStatus) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommercehubdb", "root", "");
            String insertQuery = "INSERT INTO Orders (OrderDate, TotalAmount, Status) VALUES (?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(insertQuery);

            pstmt.setString(1, orderDate);
            pstmt.setString(2, totalAmount);
            pstmt.setString(3, orderStatus);

            pstmt.executeUpdate();

            con.close();
         
           return "Order information inserted successfully!";

        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }
}
