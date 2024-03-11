package setterDemo;

public class Student {

	public int sid; //primitive
	public String name; //String
	public Address address; //User defined Object

	public Student() {
		System.out.println("Student Instance Created");
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
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
