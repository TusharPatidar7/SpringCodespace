package com.jpa.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jpa.entity.OrderRepository;
import com.jpa.entity.Orders;

@Component
public class OrderServices {
	
	@Autowired
	OrderRepository repo;
	
	public void setOrder() {
		
		Orders order1 = new Orders();
		order1.setId(105);
		order1.setCity("Delhi");
		order1.setState("Delhi");
		order1.setName("Yash");
		order1.setPrice(500);
		order1.setNoOfItems(1);
		
		Orders order2 = new Orders();
		order2.setId(106);
		order2.setCity("Indore");
		order2.setState("Mp");
		order2.setName("Kishan");
		order2.setPrice(898);
		order2.setNoOfItems(2);
		
		repo.saveAll(List.of(order1,order2));
	}
	
	public void getOrderById(long id) {
		
		Orders order = repo.findById(id).get();
		
		System.out.println(order.getId()+" "+order.getName()+" "+order.getPrice()+" "+order.getCity());
		
	}
	
	public void updateRecords(long id) {
		
		Orders order1 = new Orders();
		order1.setId(101);
		order1.setCity("Indore");
		order1.setState("mp");
		order1.setName("Raja");
		order1.setPrice(500);
		order1.setNoOfItems(3);
		repo.save(order1);
		
	}
	
	public void deleteOrderByCity(String city) {
	
		//Custom Method
		List<Orders> list = repo.findByCity(city);
		
		repo.deleteAll(list);
		
		System.out.println("Records Deleted");
	}
	
	public void getByCity() {
		
		List<Orders> list = repo.getDataWithCity("Hyd");		
		for (Orders orders : list) {
			System.out.println(orders.getName());
		}
	}
	
	public void addDataToOrders(String name, int id, String city,int count,int price,String state) {
		repo.addData(name, id, city, count, price, state);
		System.out.println("One Record Added");
	}
	
	public void removeDataOfState(String state) {
		repo.removeDataByState(state);
		System.out.println("One record removed");
	}
}
