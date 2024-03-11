package jdbcTemplate;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JdbcApplication {
	
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext();
		
		container.register(COnfigurationClass.class);
		
		container.refresh();
		
		SpringJdbcOperations op = container.getBean(SpringJdbcOperations.class);
		
		Student s1 = new Student();
		s1.setRollno(101);
		s1.setName("Raja");
		s1.setMarks(99);
		
		int as = op.addStudent(s1);
		System.out.println("Returned on adding "+as);
		
		List<Student> list = op.getAllStudentList();
		list.forEach(s->System.out.println(s));
	}
	
	
	
}
