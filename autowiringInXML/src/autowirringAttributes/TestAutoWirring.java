package autowirringAttributes;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestAutoWirring {

	public static void main(String[] args) {
		
	
		@SuppressWarnings("resource")
		BeanFactory container = new FileSystemXmlApplicationContext("C:\\Users\\Tushar Patidar\\eclipse-workspace\\springClass\\mavenProjectTest\\constructor-autowirring.xml");

		MyAccount raja = (MyAccount)container.getBean("raja");
		
		System.out.println(raja.getName());
		System.out.println(raja.getBankName());
		System.out.println(raja.getAdd().getCity());
		System.out.println(raja.getAdd().getPincode());
		System.out.println(raja.getBalance());
		

		
	}

}
