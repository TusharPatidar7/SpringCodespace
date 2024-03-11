package com.jpql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductOperations {

	@Autowired
	ProductRepository repository;

	public void addProducts() {

		Product p1 = new Product();

		p1.setPid(1);
		p1.setName("Iphone");
		p1.setPrice(150000);
		p1.setCreatedYear(2022);
		p1.setExpYear(2030);

		Product p2 = new Product();
		p2.setPid(2);
		p2.setName("Samsung Galaxy");
		p2.setPrice(120000);
		p2.setCreatedYear(2021);
		p2.setExpYear(2023);

		Product p3 = new Product();
		p3.setPid(3);
		p3.setName("oneplus");
		p3.setPrice(50000);
		p3.setCreatedYear(2020);
		p3.setExpYear(2023);
		repository.saveAll(List.of(p1, p2, p3));
	}
	
	public void displayAll() {
		repository.findAll().stream().forEach(System.out::println);
	}
	
	public List<Product> getAllProduct(){
		return repository.getAllProduct();
	}
}
