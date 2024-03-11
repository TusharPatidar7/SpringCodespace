package second.di.usingxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\Tushar Patidar\\eclipse-workspace\\springClass\\assignments\\second.xml");
		
		Employee emp = context.getBean(Employee.class);
		
		System.out.println("Employee Details ---->\n");
		
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
		System.out.println(emp.getAddress().getCity());
		System.out.println(emp.getOrganization().getName());
		System.out.println(emp.getOrganization().getAddress().getState());
		
		
		
		
	}

}
