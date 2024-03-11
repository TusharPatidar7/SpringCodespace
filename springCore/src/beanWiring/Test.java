package beanWiring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		BeanFactory factory = new FileSystemXmlApplicationContext(
				"C:\\Users\\Tushar Patidar\\eclipse-workspace\\springClass\\springCore\\src\\bean-wiring.xml");
		
		Employee emp1 = (Employee)factory.getBean("emp1");
		
		System.out.println("Employee Name : "+emp1.getName());
		System.out.println("Salary : "+emp1.getSalary());
		Address address = emp1.getAddress();
		Area area = address.getArea();
		System.out.printf("Address :%s,%s,%s", area.getFlat(),area.getBuilding(),area.getStreet());
		System.out.printf("\nCity : %s, State : %s",address.getCity(),address.getState());
		
		Employee emp2 = (Employee)factory.getBean("emp2");
		
		System.out.println("\n\nEmployee Name : "+emp2.getName());
		System.out.println("Salary : "+emp2.getSalary());
		Address address2 = emp2.getAddress();
		Area area2 = address2.getArea();
		System.out.printf("Address :%s,%s,%s", area2.getFlat(),area2.getBuilding(),area2.getStreet());
		System.out.printf("\nCity : %s, State : %s",address2.getCity(),address2.getState());
	}

}
