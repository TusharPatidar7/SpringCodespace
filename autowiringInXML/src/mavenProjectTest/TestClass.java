package mavenProjectTest;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		BeanFactory factory = new FileSystemXmlApplicationContext("C:\\Users\\Tushar Patidar\\eclipse-workspace\\springClass\\mavenProjectTest\\beans.xml");
		
		Student s =(Student)factory.getBean("student1");
		
		System.out.println("Student ID : "+s.getId());
		System.out.println("Student Name : "+s.getName());
		System.out.println(s.getSubMarks());
	}

}
