package springAutoWirring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestAutoWirring {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		BeanFactory factory = new FileSystemXmlApplicationContext("C:\\Users\\Tushar Patidar\\eclipse-workspace\\springClass\\springCore\\src\\bean-autowirring.xml");
		
		Orders order = (Orders)factory.getBean("order1");
		
		System.out.println(order.getOrderId());
		System.out.println(order.getPrice());
		System.out.println(order.getProduct());
		System.out.println(order.getProduct().getProductId());
		System.out.println(order.getProduct().getName());
		System.out.println("\n=============================\n");
		
		Orders order2 = (Orders)factory.getBean("order2");
		
		System.out.println(order2.getOrderId());
		System.out.println(order2.getPrice());
		System.out.println(order2.getProduct());
		System.out.println(order2.getProduct().getProductId());
		System.out.println(order2.getProduct().getName());
		
	}

}
