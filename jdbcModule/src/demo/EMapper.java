package demo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class EMapper implements RowMapper<Employee>{
	
	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		   Employee emp = new Employee();
		   emp.setEid(rs.getInt(1));
		   emp.setName(rs.getString(2));
		   emp.setAge(rs.getInt(3));
		   
		   return emp;
	}
	
	
}
