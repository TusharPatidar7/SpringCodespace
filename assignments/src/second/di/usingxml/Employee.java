package second.di.usingxml;

public class Employee {

	private String name;
	private int id;
	private double salary;
	private Address address;
	private Organization organization;
		
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, int id, double salary, Address address, Organization organization) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
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
	public Address getAddress() {
		return address;
	}
	public Organization getOrganization() {
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
	public void setAddress(Address address) {
		this.address = address;
	}
	public void setOrganization(Organization organization) {
		this.organization = organization;
	}
	
	
}
