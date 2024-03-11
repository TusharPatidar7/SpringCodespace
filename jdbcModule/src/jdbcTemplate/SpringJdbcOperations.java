package jdbcTemplate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class SpringJdbcOperations {

	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int addStudent(Student s) {
		
		String query = "insert into student values("+s.getRollno()+",'"+s.getName()+"',"+s.getMarks()+")";
		return jdbcTemplate.update(query);
	}
	
	public List<Student> getAllStudentList(){
		
		String query = "select * from student";
		List<Student> list = jdbcTemplate.query(query, new StudentMapper());
		return list;
	}
}
