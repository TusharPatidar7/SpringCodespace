package configureAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnnotation {

	public static void main(String[] args) {
		
		ApplicationContext factory = new AnnotationConfigApplicationContext(PriscriptionDetails.class);
		
		String[] beans = factory.getBeanDefinitionNames();
		for(String bean: beans) {
			System.out.println(bean);
		}
		
//		PriscriptionDetails details = (PriscriptionDetails)factory.getBean("priscription");
//		
//		System.out.println(details);
//		System.out.println(details.getMedicine());
//		System.out.println(details.getAmount());

	}

}
