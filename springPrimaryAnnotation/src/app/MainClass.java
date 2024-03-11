package app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beansClasses.Employee;
import beansClasses.Stanza;
import config.ConfigComponents;

public class MainClass {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(ConfigComponents.class);
		context.refresh();
		
		Employee emp1 = (Employee)context.getBean("emp1");
		System.out.println(emp1);
		
		Stanza stanza = context.getBean(Stanza.class);
		stanza.setAddress("Hyderabad");
		System.out.println(stanza.getEmployee());
		System.out.println(stanza);
		System.out.println(stanza.getAddress());
		System.out.println(stanza.getEmployee().getName());

	}

}
