package lifeCycleOfBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Hospital {
	private String name;
	private int bedCapacity;
	private Address address;
	
	public Hospital() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	public Hospital(Address address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public int getBedCapacity() {
		return bedCapacity;
	}
	public Address getAddress() {
		return address;
	}
	
	//Calling from xml using init-method attribute
	public void myInit() {
		System.out.println("calling init using xml");
	}
	
	public void myDestroy() {
		System.out.println("calling destroy using xml");
	}
	
	 	
	
//	public void afterPropertiesSet() throws Exception {
//		name = "Apolo Hospital";
//		bedCapacity = 100;
//		System.out.println("afterPropertiesSet() called");
//	}
//	@Override
//	public void destroy() throws DestroyFailedException {
//		System.out.println("Hospital bean destroyed.");
//	}
}
