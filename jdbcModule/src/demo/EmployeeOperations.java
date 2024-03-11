package demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class EmployeeOperations {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void createTable() {
		jdbcTemplate.execute("create table springemp(eid number(5), ename varchar2(20), age number(2))");
		System.out.println("Table creates by name springemp!!!!");
	}
		
	public void addEmployee(int id, String name, int age) {
		jdbcTemplate.update("insert into springemp values(?,?,?)",id,name,age);
		System.out.println("One Record Inserted!!");
	}
	public void removeEmployee(int id) {
		jdbcTemplate.update("delete from springemp where eid="+id);
		System.out.println("One employee removed!!");
	}
	public void updateName(int id, String name) {
		jdbcTemplate.update("update springemp set ename=? where eid=?",name,id);
		System.out.println("Name updated");
	}
	public List<String> getEmployeeNames(){
		return jdbcTemplate.queryForList("select ename from springemp", String.class);
	}
	//old approach
	public void printData() {
		SqlRowSet rs =  jdbcTemplate.queryForRowSet("select * from springemp order by eid");
		while(rs.next()) {
			System.out.print(rs.getInt(1)+" ");
			System.out.print(rs.getString(2)+" ");
			System.out.println(rs.getInt(3));
		}
	}
	public void printEmployees() {
		String query = "select * from springemp";
		List<Employee> list = jdbcTemplate.query(query, new EMapper());
		list.stream().forEach(o->{
			System.out.println(o.getEid()+" " +o.getName()+" "+o.getAge());
		});
	}
	
	public List<Employee> getEmployees(){
		
		List<Employee> list = jdbcTemplate.query("select * from springemp", 
				new BeanPropertyRowMapper<Employee>(Employee.class));
		
		return list;
	}	
}
