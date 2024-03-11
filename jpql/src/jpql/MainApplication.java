package jpql;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext()) {
			context.register(JpaConfig.class);
			context.refresh();

			
			  for (String string : context.getBeanDefinitionNames()) {
			  System.out.println(string); }
		} catch (BeansException | IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
//		ProductOperations op = new ProductOperations();
//		op.getData();

	}
}
