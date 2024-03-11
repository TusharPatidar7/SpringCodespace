package lifeCycleOfBean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestBeans {

	public static void main(String[] args) {
		System.out.println("------ XML -----------");
		FileSystemXmlApplicationContext factory = new FileSystemXmlApplicationContext("C:\\Users\\Tushar Patidar\\eclipse-workspace\\springClass\\lifeCycleOfBean\\beans.Xml");
		factory.close();
		
		System.out.println("\n------ Annotation -----------");
				
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(Config.class);
		context.refresh();
		
//		for (String s : context.getBeanDefinitionNames()) {
//			System.out.println(s);
//		}
		
//		Hospital hs = context.getBean(Hospital.class);
//		System.out.println(hs.getAddress().getState());
//		
		context.close();
	}
}
