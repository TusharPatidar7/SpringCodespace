package BankDetails;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BeanFactory factory = new FileSystemXmlApplicationContext("C:\\Users\\Tushar Patidar\\eclipse-workspace\\springClass\\mavenProjectTest\\bank.xml");
		
		MyAccount c1 = (MyAccount)factory.getBean("customer1");
		
		
		System.out.println(c1.getName());
		System.out.println(c1.getAddress().getCity());
		System.out.println(c1.getAddress().getPincode());
	}

}
