package com.jpql;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JpqlDemo {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.scan("com.*");
		context.refresh();
		
//		Stream.of(context.getBeanDefinitionNames()).forEach(System.out::println);
		
		ProductOperations op = context.getBean(ProductOperations.class);
//		op.addProducts();
		System.out.println("\n");
//		op.displayAll();
		
		System.out.println(op.getAllProduct());
	}

}
