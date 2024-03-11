package seventh;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("seventh")
@Configuration
public class MainClass {
	
	//7 and 8 Assignment both done in this.
	
	//7
//	• NOTE : Configure Bean with Annotations. NO XML configurations.
//	• NOTE : Use only Component classes
//	• NOTE : Don’t Use Configuration Classes and Bean Methods
	
	//8
//	• NOTE : Configure Bean with Annotations. NO XML configurations.
//	• NOTE : Use Component classes and minimum one Bean Method Configuration for every
//	Bean class i.e. More than one Bean Configurations of every Bean class, so more than one
//	Bean Objects of Bean class.

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(MainClass.class);
		context.register(BeanConfiguration.class);
		context.refresh();
		
		for(String name: context.getBeanDefinitionNames()) {
			System.out.println(name);
		}
		System.out.println("\n*********************************\n");
		
		//Used @Primary on bean method that is the reason, bean method objects are injected.
		
		Employee emp = context.getBean(Employee.class);
//		emp.setName("Kishan Patidar");
		System.out.println("Employee Name : "+emp.getName());
		
		Address empAddress = emp.getAddress();
		empAddress.setCity("Banglore");
		System.out.println("Employee Address : "+empAddress.getCity());
		
		Organization empOrg = emp.getOrganization();
		empOrg.setName("CData Banglore");
		
		Address orgAdd = context.getBean(Address.class);
		orgAdd.setCity("Indore");
		
		empOrg.setAddress(orgAdd);
		System.out.println("Employee Works at : "+empOrg.getName()+" "+empOrg.getAddress().getCity());
		

	}

}
