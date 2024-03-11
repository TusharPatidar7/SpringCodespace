package jdbcTemplate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@ComponentScan("jdbcTemplate")
@Configuration
public class COnfigurationClass {
	
	@Bean
	public JdbcTemplate CreateDataSourceInstance() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		ds.setUsername("mydb");
		ds.setPassword("buddy");
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		return new JdbcTemplate(ds);
	}
	
}
