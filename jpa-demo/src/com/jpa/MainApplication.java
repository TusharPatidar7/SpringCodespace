package com.jpa;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(ConfigJpa.class);
		context.refresh();
		
		
		BookOperations op = context.getBean(BookOperations.class);
		op.addBooks();
		
		System.out.println("Added 1 Book");

		
	}

}
