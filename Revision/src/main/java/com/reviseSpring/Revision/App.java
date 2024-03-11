package com.reviseSpring.Revision;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
  public static void main(String[] args) {

	  try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigJpa.class)) {
		context.getBean(DaO.class).getAll().stream().forEach(System.out::println);
	} catch (BeansException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
  }
}
