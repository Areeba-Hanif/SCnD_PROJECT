package main;

public class Order {
	
	  public int orderId;
	  public String orderDate;
	  public String totalAmount;
	  public String orderStatus;
	  
	  public Order(int orderId,String orderDate,String totalAmount,String orderStatus) {
		  this.orderId=orderId;
		  this.orderDate=orderDate;
		  this.totalAmount=totalAmount;
		  this.orderStatus=orderStatus;
	  }
	  
	  public Order() {
		  
	  }
}
