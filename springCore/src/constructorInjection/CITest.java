package constructorInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class CITest {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		BeanFactory factory = new FileSystemXmlApplicationContext("C:\\Users\\Tushar Patidar\\eclipse-workspace\\springClass\\springCore\\src\\CI-Demo.xml");
		
//		//Constructor Injection
//		Employee emp1 = (Employee)factory.getBean("emp1");
//	
//		System.out.println(emp1.empid);
//		System.out.println(emp1.name);
//		System.out.println(emp1.salary);
//		
//		//Setter Injection
//		Employee emp2 = (Employee)factory.getBean("emp2");
//		
//		System.out.println(emp2.empid);
//		System.out.println(emp2.name);
//		System.out.println(emp2.salary);
		
		Order o1 = (Order)factory.getBean("order1");
		System.out.println(o1.getId());
		System.out.println(o1.getItem());
		System.out.println(o1.getAmount());
		
		Order o2 = (Order)factory.getBean("order3");
		System.out.println(o2.getList());
		System.out.println(o2.getPrices());
		System.out.println(o2.getDetails());
	}

}
