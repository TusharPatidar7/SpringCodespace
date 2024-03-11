package setterInjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(Config.class);
		context.refresh();
		
		BankDetails details = context.getBean(BankDetails.class);
		
		for (String s : context.getBeanDefinitionNames()) {
			System.out.println(s);
		}
		
		System.out.println(details.getBranch().getCity());
	}
}
