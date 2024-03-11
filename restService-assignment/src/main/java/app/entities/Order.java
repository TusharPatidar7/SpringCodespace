package app.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="order_info")
public class Order {
//	Order Id : Integer  
//	Amount : Double  
//	No Of Items  : Integer  
//	Items : String array [] 
//	Order status : String  
//	Payment status :  
//	User : 
	
	private int orderId;
	private double amount;
	private int noOfItems;
	private String[] items;
	private String orderStatus;
	private User user;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
		
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getNoOfItems() {
		return noOfItems;
	}
	public void setNoOfItems(int noOfItems) {
		this.noOfItems = noOfItems;
	}
	public String[] getItems() {
		return items;
	}
	public void setItems(String[] items) {
		this.items = items;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

}
