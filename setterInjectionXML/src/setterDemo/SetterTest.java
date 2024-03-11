package setterDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SetterTest {

	public static void main(String[] args) {
		
		BeanFactory factory = new FileSystemXmlApplicationContext("C:\\Users\\Tushar Patidar\\eclipse-workspace\\springClass\\setterDemo\\spring-demo.xml");
		
		System.out.println("----------------------------------------");
		
		Address ad = (Address)factory.getBean("add1");

		System.out.println("Address : "+ad.getCity()+" "+ad.country+" "+ad.pincode+"\n");
		
		Student s1 = (Student)factory.getBean("stu1");
		
		System.out.println("First Student Deatails : ");
		System.out.println("Id : "+s1.sid);
		System.out.println("Name : "+s1.name);
		Address s1a = s1.address;
		System.out.println("Address : "+s1a.getCity()+" "+s1a.country+" "+s1a.pincode+"\n");
		
		Student s2 = (Student)factory.getBean("stu2");
		
		System.out.println("First Student Deatails : ");
		System.out.println("Id : "+s2.sid);
		System.out.println("Name : "+s2.name);
		Address s2a = s2.address;
		System.out.println("Address : "+s2a.getCity()+" "+s2a.country+" "+s2a.pincode+"\n");
		
		Employee emp = (Employee)factory.getBean("emp");
		
		System.out.println("First Employee Deatails : ");
		System.out.println("Id : "+emp.eid);
		System.out.println("Name : "+emp.name);
		Address empa = emp.address;
		System.out.println("Address : "+empa.getCity()+" "+empa.country+" "+empa.pincode+"\n");
		
		Employee emp2 = (Employee)factory.getBean("emp2");
		
		System.out.println("First Employee Deatails : ");
		System.out.println("Id : "+emp2.eid);
		System.out.println("Name : "+emp2.name);
		Address emp2a = emp2.address;
		System.out.println("Address : "+emp2a.getCity()+" "+emp2a.country+" "+emp2a.pincode+"\n");
		
	}

}
