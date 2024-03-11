package seventh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Organization {

	private String name;
	@Autowired
	private seventh.Address address;
	
//	@Autowired
//	public Organization(Address address) {
//		super();
//		this.address = address;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	@Autowired
	public void setAddress(seventh.Address address) {
		this.address = address;
	}
	public seventh.Address getAddress() {
		return address;
	}
	
}
