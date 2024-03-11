package autowirringAttributes;

public class MyAccount {
	
	private String name;
	private String bankName;
	private double balance;
	private Address add;

	public MyAccount(String name, String bankName, double balance, Address add) {
		super();
		this.name = name;
		this.bankName = bankName;
		this.balance = balance;
		this.add = add;
	}

	public String getName() {
		return name;
	}

	public Address getAdd() {
		return add;
	}

	public String getBankName() {
		return bankName;
	}

	public double getBalance() {
		return balance;
	}
}
