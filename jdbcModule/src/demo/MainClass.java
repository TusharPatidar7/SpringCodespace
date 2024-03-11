package demo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(ConfigClass.class);
		context.refresh();
		
		EmployeeOperations emp = context.getBean(EmployeeOperations.class);
//		emp.createTable();
//		emp.addEmployee(101, "Tushar", 22);
//		emp.removeEmployee(1);
//		emp.updateName(102, "Harsh");
//		
		List<String> names = emp.getEmployeeNames();
		names.stream().forEach(System.out::println);
		
//		emp.printData();
		
		emp.getEmployees().stream().forEach(o->{
			System.out.println(o.getEid()+" " +o.getName()+" "+o.getAge());
		});
		
		emp.printEmployees();
		
		
	}

}
