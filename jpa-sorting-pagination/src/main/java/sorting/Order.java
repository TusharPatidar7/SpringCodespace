 package sorting;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="order_details")
@Entity
public class Order {
	
	@Id
	@Column(name="id")
	private long id;
	
	@Column
	private String city;
	
	@Column
	private int price;
	
	public long getOrder_id() {
		return id;
	}

	public void setOrder_id(long order_id) {
		id = order_id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[ "+id+" , "+city+" , "+price+" ]";
	}
}
