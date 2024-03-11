package school;

import org.springframework.stereotype.Component;

@Component
public class KanwartaraSchool {
	private String address;
	private int pin;
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
}
