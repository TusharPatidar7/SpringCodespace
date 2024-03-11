package second.di.usingxml;

public class Organization {
	
	private String name;
	private Address address;
	
	public Organization() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Organization(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	
}
