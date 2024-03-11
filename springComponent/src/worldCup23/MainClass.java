package worldCup23;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import iccFormats.OneDay;
import iccFormats.T20;
import iccFormats.Test;

public class MainClass {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//		context.scan("iccFormats");
		context.register(IccConfig.class);
		context.refresh();
		
		for(String s: context.getBeanDefinitionNames()) {
			System.out.println(s);
		}
		
		System.out.println("\n----------OneDay----------");
		OneDay oneDay = context.getBean(OneDay.class);
		oneDay.setOvers(50);
		oneDay.setJerseyColor("Team Jersey");
		System.out.println("Overs : "+oneDay.getOvers());
		System.out.println("JerseyColor : "+oneDay.getJerseyColor());
		
		System.out.println("\n----------T20----------");
		T20 t20 = context.getBean(T20.class);
		t20.setOvers(20);
		t20.setJerseyColor("Team Jersey");
		System.out.println("Overs : "+t20.getOvers());
		System.out.println("JerseyColor : "+t20.getJerseyColor());
		
		System.out.println("\n----------Test----------");
		Test test = context.getBean(Test.class);
		test.setOvers(90);
		test.setJerseyColor("White");
		System.out.println("Overs : "+test.getOvers());
		System.out.println("JerseyColor : "+test.getJerseyColor());
		
	}
}
