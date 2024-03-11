package seventh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	private String name;
	private int id;
	private double salary;

	//FieldInjection
	@Autowired
	private seventh.Address address;
	@Autowired
	private seventh.Organization organization;
		
	//Constructor Injection
//	@Autowired
//	public Employee( Address address,  Organization organization) {
//	super();
//	this.address = address;
//	this.organization = organization;
//}
	//Setter Injection
//	@Autowired
//	public void setAddress(seventh.Address address) {
//		this.address = address;
//	}
//	@Autowired
//	public void setOrganization(seventh.Organization organization) {
//		this.organization = organization;
//	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public double getSalary() {
		return salary;
	}
	
	public seventh.Address getAddress() {
		return address;
	}

	public seventh.Organization getOrganization() {
		return organization;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
