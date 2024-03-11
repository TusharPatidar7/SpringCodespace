package com.amazon;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import amazonConfig.AmazonConfigClass;
import amazonConfig.SecondConfigClass;
import amazonProduct.Product;
import amazonUser.Users;

public class AmazonApp {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(SecondConfigClass.class);
		context.register(AmazonConfigClass.class);
		context.refresh();
		
		//AmazonConfigClass configuration
		
		Product product1 = (Product)context.getBean("p1"); //Bean name
		
		Users user1 = (Users)context.getBean("u1"); // Bean name
		
		Product product2 = (Product)context.getBean("getProduct2"); //without bean name
		
		Users user2 = (Users)context.getBean("amazonUser2");//without bean name
		
		System.out.println(product1.getProductName());
		System.out.println(product1.getPrice());
		System.out.println(product1.getQuantity());
		System.out.println("==============>>>>>>>>>>");
		System.out.println(user1.getUserName());
		System.out.println(user1.getMobileNumber());
		System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println(product2.getProductName());
		System.out.println(product2.getPrice());
		System.out.println(product2.getQuantity());
		System.out.println("==============>>>>>>>>>>");
		System.out.println(user2.getUserName());
		System.out.println(user2.getMobileNumber());
		
		//SecondConfigClass configuration
		
		Product product3 = (Product)context.getBean("p3");
		
		Users user3 = (Users)context.getBean("u3");
		
		System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println(product3.getProductName());
		System.out.println(product3.getPrice());
		System.out.println(product3.getQuantity());
		System.out.println("==============>>>>>>>>>>");
		System.out.println(user3.getUserName());
		System.out.println(user3.getMobileNumber());
	}

}
