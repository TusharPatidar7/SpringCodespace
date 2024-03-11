package jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext factory = new FileSystemXmlApplicationContext("C:\\Users\\Tushar Patidar\\eclipse-workspace\\springClass\\jdbcModuleWithXML\\mypom.xml");
		
		ProductOperations p = (ProductOperations)factory.getBean("operation");
//		p.display();
		
		List<String> pNames = p.getProductNames();
		
		pNames.stream().forEach(System.out::println);
		
//		for (String s : factory.getBeanDefinitionNames()) {
//			System.out.println(s);
//		}

	}

}
