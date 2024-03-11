package task;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@EnableJpaRepositories("task")
@ComponentScan("task")
@Configuration
public class JpaConfiguration {

	@Bean
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		ds.setUsername("mydb");
		ds.setPassword("buddy");
		return ds;
	}
	
	@Bean("entityManagerFactory")
	public LocalContainerEntityManagerFactoryBean getEntityManager() {
		LocalContainerEntityManagerFactoryBean container = new LocalContainerEntityManagerFactoryBean();
		container.setDataSource(getDataSource());
		container.setPackagesToScan("task");
		container.setJpaProperties(getProperties());
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		container.setJpaVendorAdapter(adapter);
		return container;
	}
	
	@Bean("transactionManager")
	public JpaTransactionManager createManager() {
		JpaTransactionManager manager = new JpaTransactionManager();
		manager.setEntityManagerFactory(getEntityManager().getObject());
		return manager;
	}

	private Properties getProperties() {
		Properties p = new Properties();
		p.setProperty("hibernate.hbm2ddl.auto", "none");
		p.setProperty("hibernate.show_sql", "true");
//		p.setProperty("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
		return p;
	}
}
