package springCoreDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SwiggyApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory container = new FileSystemXmlApplicationContext("C:\\Users\\Tushar Patidar\\eclipse-workspace\\springClass\\springCore\\spring-beans.xml");
		Order o =(Order)container.getBean("order1");
		System.out.println(o.getOrderId());
		System.out.println(o.getOrderDate());
		System.out.println(o.getOrders());
		System.out.println(o.getQuantity());
		System.out.println(o.getPrice());
	}

}
