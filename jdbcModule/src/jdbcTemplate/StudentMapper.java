package jdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Student student = new Student();
		student.setMarks(rs.getInt("marks"));
		student.setName(rs.getString("name"));
		student.setRollno(rs.getInt("rollno"));
		return student;
	}
}
