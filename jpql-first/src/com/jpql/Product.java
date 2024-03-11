package com.jpql;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
	@Column(name = "product_id")
	private int pid;

	// Property name = column name, no need to define name value 
	@Column
	private double price;

	//@Column
	private String name;

	@Column(name = "expiry_year")
	private int expYear;

	private int createdYear;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExpYear() {
		return expYear;
	}

	public void setExpYear(int expYear) {
		this.expYear = expYear;
	}

	public int getCreatedYear() {
		return createdYear;
	}

	public void setCreatedYear(int createdYear) {
		this.createdYear = createdYear;
	}

	@Override
	public String toString() {
		return "ProductDetails [pid=" + pid + ", price=" + price + ", name=" + name + ", expYear=" + expYear
				+ ", createdYear=" + createdYear + "]";
	}
}
