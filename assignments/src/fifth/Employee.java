package fifth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import second.di.usingxml.Address;
import second.di.usingxml.Organization;

@Component
public class Employee {

	private String name;
	private int id;
	private double salary;
	

	private fifth.Address address;
//	@Autowired
	private fifth.Organization organization;
		
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Autowired
	public Employee(fifth.Address address, fifth.Organization organization) {
		super();
		
		this.address = address;
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
	public fifth.Address getAddress() {
		return address;
	}
	public fifth.Organization getOrganization() {
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
	
//	@Autowired
	public void setAddress(fifth.Address address) {
		this.address = address;
	}
//	@Autowired
	public void setOrganization(fifth.Organization organization) {
		this.organization = organization;
	}
	
}
