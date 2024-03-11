package first.usingxml;

import java.util.Map;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/*Assignment 1:
NOTE : Configure Bean with XML file.
Create a Bean class with properties of

• Student ID
• Student Name
• Map of Subjects and marks.

TASK 1:
• Create one Bean Configuration with Setter Injection of above properties.
• Create another Bean Configuration with Constructor Injection of above properties.
• Get Both Bean configuration Objects and print Details*/
public class HandleDependencies {
	
	public static void main(String[] args) {
		
		BeanFactory factory = new FileSystemXmlApplicationContext("C:\\Users\\Tushar Patidar\\eclipse-workspace\\springClass\\assignments\\first.xml");
		
		Student s1 = (Student)factory.getBean("s1");
		Student s2 = (Student)factory.getBean("s2");
		
		System.out.println("------ Setter Injection ----------");
		System.out.println(s1.getName());
		Map map = s1.getMarks();
		map.forEach((k,v)->System.out.println(k+" : "+v));
	
		System.out.println("------ Constructor Injection ----------");
		System.out.println(s2.getName());
		Map map2 = s2.getMarks();
		map2.forEach((k,v)->System.out.println(k+" : "+v));
	}
	
}
