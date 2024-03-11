package jdbc;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class ProductOperations {


	JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}  
	
	public List<String> getProductNames(){
		return jdbcTemplate.queryForList("select ename from springemp", String.class);
	}
	
	public void display() {
		 List<Product> list =jdbcTemplate.query("select * from springemp",
				 new BeanPropertyRowMapper<Product>(Product.class));
		 
		 for (Product product : list) {
			System.out.println(product.getEname());
		}
	}
	
}
