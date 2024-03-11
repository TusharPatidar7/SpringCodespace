package mainApp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import college.College;
import config.CongifClass;
import school.KanwartaraSchool;
import university.University;

public class MainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CongifClass.class);
//		context.scan("college","mainApp","school","university");
//		context.refresh();
		
		for(String s: context.getBeanDefinitionNames()) {
			System.out.println(s);
		}
		
		KanwartaraSchool school = context.getBean(KanwartaraSchool.class);
		
		school.setAddress("Mandleshwar");
		school.setPin(451225);
		System.out.println("\nSchool Info ------->");
		System.out.println(school.getAddress());
		System.out.println(school.getPin());
		
		College college = (College)context.getBean("pmb");
		
		college.setCity("Indore");
		college.setPincode(451220);
		
		System.out.println("\nCollege Info -------->");
		System.out.println(college.getCity());
		System.out.println(college.getPincode());
		
		University un = (University)context.getBean("university");
		un.setAddress("Indore");
		un.setPin(451213);
		System.out.println("\nUniversity Info -------->");
		System.out.println(un.getAddress());
		System.out.println(un.getPin());
		
		University un2 = (University)context.getBean("davv");
		University un3 = (University)context.getBean("sage");
		
		System.out.println(un);
		System.out.println(un2);
		System.out.println(un3);
	}

/*Configuration
 * component
 * componentScan
 * Bean
 * scope
 * */
}
