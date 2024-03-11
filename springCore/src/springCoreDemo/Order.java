package springCoreDemo;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Order {
	private int orderId;
	private String orderDate;
	private List<String> orders;
	private Set<Integer> quantity;
	private Map<String, Integer> price;
		
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public List<String> getOrders() {
		return orders;
	}
	public void setOrders(List<String> orders) {
		this.orders = orders;
	}
	public Set<Integer> getQuantity() {
		return quantity;
	}
	public void setQuantity(Set<Integer> quantity) {
		this.quantity = quantity;
	}
	public Map<String, Integer> getPrice() {
		return price;
	}
	public void setPrice(Map<String, Integer> price) {
		this.price = price;
	}
}
