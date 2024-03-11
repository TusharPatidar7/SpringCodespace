package autowiring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		Zoo zoo = context.getBean(Zoo.class);
		System.out.println(zoo.getAnimal());
//		
		
		Lion lion = (Lion)context.getBean(Lion.class);
		System.out.println(lion.getAnimal());
		
		Tiger tiger = (Tiger)context.getBean("tiger");
		System.out.println(tiger.getAnimal());
	}

}
