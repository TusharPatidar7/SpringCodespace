package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import beansClasses.Employee;

@Configuration
@ComponentScan("beansClasses")
public class ConfigComponents {
	
	@Bean("emp1")
	public Employee getEmp1() {
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Bhuvan");
		return emp;
	}
	@Primary //Will provide this object as default object
	@Bean("emp2")
	public Employee getEmp2() {
		Employee emp = new Employee();
		emp.setId(2);
		emp.setName("Rana");
		return emp;
	}
}
