package constructorInjection;

public class Employee {

	int empid;
	String name;
	double salary;
	
	public Employee(int empid, String name, double salary) {
		this.empid=empid;
		this.name=name;
		this.salary=salary;
	}

	public Employee() {
		
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
