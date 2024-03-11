package fourth;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(FConfig.class);
		context.refresh();
		
		
		AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext();
		context2.register(SConfig.class);
		context2.refresh();
		
		Student s1 = (Student)context.getBean("student1");
		System.out.println(s1.getName());//raja
		
		
		Student s2 = (Student)context2.getBean("student2");
		System.out.println(s2.getName());//null
		
//		for (String string : context.getBeanDefinitionNames()) {
//			System.out.println(string);
//		}
		
	}

}
