package fifth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import second.di.usingxml.Address;

@Component
public class Organization {

	private String name;
	
	private fifth.Address address;
	
	
	@Autowired
	public Organization( fifth.Address address) {
		super();
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public fifth.Address getAddress() {
		return address;
	}
	
//Setter Injection
//	@Autowired()
	public void setAddress(fifth.Address address) {
		this.address = address;
	}
}
