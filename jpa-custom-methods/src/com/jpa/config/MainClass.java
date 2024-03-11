package com.jpa.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(JpaConfiguration.class);
		context.refresh();
		
		OrderServices os = context.getBean(OrderServices.class);
		
//		os.setOrder();
//		os.updateRecords(101);
//		os.getOrderById(101);
//		os.deleteOrderByCity("Indore");
		
//		os.getByCity();
		
//		os.addDataToOrders("Shyam", 109, "Indore", 1, 500, "MP");
		
//		os.removeDataOfState("Delhi");
	}

}
