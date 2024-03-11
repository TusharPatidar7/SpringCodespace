package sixth;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationClass {
	
	@Bean
	public Employee createEmp() {
		Employee emp = new Employee("Raja", createAddress(), createOrg());
		emp.setId(110);
		emp.setName("Prafull");
		emp.setSalary(50500);
		emp.getAddress().setCity("Hyderabad");
		
		return emp;
	}
	
	@Bean
	public Organization createOrg() {
		Organization o = new Organization("Deloite",createAddress());		
		return o;
	}
	
	@Bean
	public Address createAddress() {
		Address a = new Address();
		a.setCity("Indore");
		return a;
	}
	
}
