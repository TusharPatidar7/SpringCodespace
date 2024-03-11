package com.bcci.config;

import java.util.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(JpaConfiguration.class);
		context.refresh();
		
		for (String string : context.getBeanDefinitionNames()) {
			System.out.println(string);
		}
		
		BCCIOperations ops = context.getBean(BCCIOperations.class);
		Team team = new Team();
		team.setId(1);
		team.setCaptain("Kapil Dev");
		team.setTrophies(1);
		Date date = new Date();
		date.setDate(1983);
		team.setYears(date);
		
//		ops.setData(team);
//		ops.removeData(1);
//		ops.printData(1);
//		ops.displayAll();
		
	}

}
