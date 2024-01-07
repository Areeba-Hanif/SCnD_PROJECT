
package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateOrderInformation {

    public static String updateOrder(int orderId, String newOrderDate, String newTotalAmount, String newOrderStatus) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommercehubdb", "root", "");
            String updateQuery = "UPDATE Orders SET OrderDate = ?, TotalAmount = ?, Status = ? WHERE OrderID = ?";
            PreparedStatement pstmt = con.prepareStatement(updateQuery);

            pstmt.setString(1, newOrderDate);
            pstmt.setString(2, newTotalAmount);
            pstmt.setString(3, newOrderStatus);
            pstmt.setInt(4, orderId);

            int rowsUpdated = pstmt.executeUpdate();

            con.close();

            if (rowsUpdated > 0) {
                return "Order information updated successfully!";
                
            } else {
                return "Order not found or information not updated.";
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }
}
