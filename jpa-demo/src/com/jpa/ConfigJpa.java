package com.jpa;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

@ComponentScan("com.jpa")
@EnableJpaRepositories("com.jpa")
@Configuration
public class ConfigJpa {
	
	//DataSource object to provide connection details
	@Bean
	public DataSource getDataSource() {
		
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		ds.setUsername("mydb");
		ds.setPassword("buddy");
		return ds;
	}
	
	//Entity Manager Factory instance
	@Bean("entityManagerFactory")
	public LocalContainerEntityManagerFactoryBean createEMF() {
		
		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
		
		//1. set DataSource Details
		factory.setDataSource(getDataSource());
		
		//2. Package info of Entity Classes
		factory.setPackagesToScan("com.jpa");
		
		//3. Hibernate Framework properties to Entity Manager
		factory.setJpaProperties(configureHibernateProps());
		
		//4. Vendor, implementation provider for JPA like Hibernate
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		factory.setJpaVendorAdapter(adapter);
		
		return factory;
	}
	
	//Transaction Manager
	@Bean("transactionManager")
	public PlatformTransactionManager createTM() {
		
		JpaTransactionManager  transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(createEMF().getObject());
		
		return transactionManager;
	}

	public Properties configureHibernateProps() {

		Properties props = new Properties();
		props.setProperty("hibernate.hbm2ddl.auto", "validate");
		props.setProperty("hibernate.show_sql", "true");
		
		return props;
	}
	
}
