package springScopeProject;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BeanFactory factory = new FileSystemXmlApplicationContext("C:\\Users\\Tushar Patidar\\eclipse-workspace\\springClass\\springScopeProject\\scope-bean.xml");
		
		Employee emp = (Employee)factory.getBean("emp1");
		
		System.out.println(emp.getName());
		System.out.println(emp.getId());
		System.out.println(emp.getAddress().getCity());
		System.out.println("emp : "+emp);
		System.out.println("emp address : "+emp.getAddress());
		
		System.out.println("==========");
		Employee emp2 = (Employee)factory.getBean("emp1");
		
		System.out.println("emp2 : "+emp2);
		System.out.println("emp2 address : "+emp2.getAddress());
		
	}

}
