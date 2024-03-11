package third;

public class Organization {
	
	private String name;
	private Address office;
	
	public Organization() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Organization(String name, Address address) {
		super();
		this.name = name;
		this.office = address;
	}
	
	public Address getOffice() {
		return office;
	}
	public void setOffice(Address office) {
		this.office = office;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}		
}
