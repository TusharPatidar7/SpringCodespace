package constructorInjection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Order {
	private int id;
	private String item;
	private int amount;
	private List<String> list;
	private Set<Double> prices;
	private Map<String, Integer> details;
	
	public Order(int id, String item, int amount) {
		this.id = id;
		this.item = item;
		this.amount = amount;
	}
	
	public Order() {
		
	}
	
	public Order(List<String> list, Set<Double> prices, Map<String, Integer> details) {
		this.list = list;
		this.prices = prices;
		this.details = details;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public Set<Double> getPrices() {
		return prices;
	}
	public void setPrices(Set<Double> prices) {
		this.prices = prices;
	}
	public Map<String, Integer> getDetails() {
		return details;
	}
	public void setDetails(Map<String, Integer> details) {
		this.details = details;
	}
	
}
