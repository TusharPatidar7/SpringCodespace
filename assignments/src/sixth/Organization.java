package sixth;

import org.springframework.beans.factory.annotation.Autowired;

public class Organization {

	private String name;
//	@Autowired
	private sixth.Address address;
	
	
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
	@Autowired
	public void setAddress(sixth.Address address) {
		this.address = address;
	}
	public sixth.Address getAddress() {
		return address;
	}
	
}
