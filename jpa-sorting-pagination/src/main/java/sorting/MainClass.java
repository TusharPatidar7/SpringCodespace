package sorting;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(JpaConfiguration.class);
		context.refresh();
		
//		for (String string : context.getBeanDefinitionNames()) {
//			System.out.println(string);
//		}
		
		OrderData od = context.getBean(OrderData.class);
//		od.getData();
		
		od.getFirstPage();
		
		System.out.println("\n\n");
		
		od.getSecondPage(1, 3);
	}

}
