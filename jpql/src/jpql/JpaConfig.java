package jpql;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.Transactional;

@ComponentScan("jpql.*")
@EnableJpaRepositories("jpql.*")
@Configuration
public class JpaConfig {

	@Bean
	public DataSource SetDatabase() {
		DriverManagerDataSource db = new DriverManagerDataSource();
		db.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		db.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		db.setUsername("mydb");
		db.setPassword("buddy");		
		return db;		
	}
	@Bean("entityManagerFactory")
	public LocalContainerEntityManagerFactoryBean getEntityManager() {
		LocalContainerEntityManagerFactoryBean lc = new LocalContainerEntityManagerFactoryBean();
		lc.setDataSource(SetDatabase());
		lc.setPackagesToScan("jpql.*");
		lc.setJpaProperties(getHibernateProperties());
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter(); 
		lc.setJpaVendorAdapter(adapter);
		return lc;
	}
	@Transactional("transactionManager")
	public JpaTransactionManager transactionManager() {
		JpaTransactionManager manager = new JpaTransactionManager();
		manager.setEntityManagerFactory(getEntityManager().getObject());
		return manager;
	}
	public Properties getHibernateProperties() {
		Properties props = new Properties();
		props.setProperty("hibernate.hbm2ddl.auto", "validate");
		props.setProperty("hibernate.show_sql", "true");
		return props;
	}
}
