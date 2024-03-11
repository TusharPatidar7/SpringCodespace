package fifth;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(ConfigurationClass.class);
		context.refresh();
		
//		for (String string : context.getBeanDefinitionNames()) {
//			System.out.println(string);
//		}
		
		Organization org = context.getBean(Organization.class);
		org.setName("Patidar and Son's");
		org.getAddress().setCity("Maheshwar");
		System.out.println("Company Address : "+org.getAddress().getCity());
		
		Employee emp = context.getBean(Employee.class);
		emp.setName("Kishan Patidar");
		System.out.println("Employee Name : "+emp.getName());
		
		System.out.println("Employee Address : "+emp.getAddress().getCity());
		System.out.println("Employee Works at : "+emp.getOrganization().getName());

	}

}
