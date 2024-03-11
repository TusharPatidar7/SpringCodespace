package sixth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	private String name;
	private int id;
	private double salary;

	//FieldInjection
//	@Autowired
	private sixth.Address address;
//	@Autowired
	private sixth.Organization organization;
		
	//Constructor Injection
	@Autowired
	public Employee(String name, @Qualifier("empAdd") Address address, @Qualifier("org") Organization organization) {
	super();
	this.name = name;
	this.address = address;
	this.organization = organization;
}
	//Setter Injection
//	@Autowired
	public void setAddress(sixth.Address address) {
		this.address = address;
	}
//	@Autowired
	public void setOrganization(sixth.Organization organization) {
		this.organization = organization;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public double getSalary() {
		return salary;
	}
	public sixth.Address getAddress() {
		return address;
	}
	public sixth.Organization getOrganization() {
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
