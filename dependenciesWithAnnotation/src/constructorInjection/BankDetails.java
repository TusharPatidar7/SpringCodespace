package constructorInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BankDetails {
	
	private String bankName;
	private Address branch;
	
	@Autowired
	public BankDetails(@Qualifier("address2") Address branch)
	{
		super();
		branch.setCity("Maheshwar");
		this.branch = branch;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public Address getBranch() {
		return branch;
	}
	public void setBranch(Address branch) {
		this.branch = branch;
	}
}
