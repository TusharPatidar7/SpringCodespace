package seventh;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeanConfiguration {

	@Primary
	@Bean
	public Address addressBean() {
		Address address = new Address();
		address.setCity("Hyderabad");
		address.setState("Telangana");
		return address;
	}
	@Primary
	@Bean 
	public Organization orgBean() {
		Organization org = new Organization();
		org.setName("NareshIt");
		return org;
	}
	@Primary
	@Bean
	public Employee empBean() {
		
		Employee emp = new Employee();
		emp.setId(155);
		emp.setName("Harsh Patidar");
		emp.setSalary(10000000);
		return emp;
	}
}
