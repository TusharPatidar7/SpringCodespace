package third;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new FileSystemXmlApplicationContext(
				"C:\\Users\\Tushar Patidar\\eclipse-workspace\\springClass\\assignments\\third.xml");

		Employee emp = context.getBean(Employee.class);

		System.out.println("Employee Details ---->\n");

		System.out.println("Empolyee ID : "+emp.getId());
		System.out.println("Employee Name : "+emp.getName());
		System.out.println("Salary : "+emp.getSalary());
		System.out.println("Employee Address : "+emp.getAddress().getCity());
		System.out.println("Company Name : "+emp.getOrganization().getName());
		
		System.out.print("Company Address : "+emp.getOrganization().getOffice().getCity());
		System.out.print(", "+emp.getOrganization().getOffice().getState());
		System.out.println(", "+emp.getOrganization().getOffice().getPincode());

	}

}
