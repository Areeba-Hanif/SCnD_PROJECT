package main;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class ViewAllOrders {

   
    public Order[] getOrders() {
        List<Order> ordersList = new ArrayList<>();

        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommercehubdb", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Orders");

            while (rs.next()) {
                int orderId = rs.getInt(1);
                String orderDate = rs.getString(2);
                String totalAmount = rs.getString(3);
                String orderStatus = rs.getString(4);

                Order orderInfo = new Order(orderId, orderDate, totalAmount, orderStatus);
                ordersList.add(orderInfo);
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ordersList.toArray(new Order[0]);
    }
}