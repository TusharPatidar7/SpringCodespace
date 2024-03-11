package configureAnnotation;

import org.springframework.stereotype.Component;

@Component
public class PriscriptionDetails {
	
	private String medicine;
	private double amount;
	
//	public PriscriptionDetails(String medicine, double amount) {
//		this.medicine = medicine;
//		this.amount = amount;
//	}
	public String getMedicine() {
		return medicine;
	}
	public void setMedicine(String medicine) {
		this.medicine = medicine;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}
