package main;

public class Order {
    private int orderId;
    private String orderDate;
    private String totalAmount;
    private String orderStatus;

    public Order(int orderId, String orderDate, String totalAmount, String orderStatus) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.orderStatus = orderStatus;
    }

    public Order() {
    }

    public int getOrderId() {
        return orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public String getOrderStatus() {
        return orderStatus;
    }
}
