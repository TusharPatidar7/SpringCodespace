package com.jpql.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;


@EnableJpaRepositories("com.*")
@Configuration
public class JpaConfiguration {

	@Bean
	public DataSource createDataSource() {
		
		DriverManagerDataSource db = new DriverManagerDataSource();
		db.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		db.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		db.setUsername("mydb");
		db.setPassword("buddy");		
		return db;		
	}
	@Bean("entityManagerFactory")
	public LocalContainerEntityManagerFactoryBean createManager() {
		LocalContainerEntityManagerFactoryBean container = new LocalContainerEntityManagerFactoryBean();
		container.setDataSource(createDataSource());
		container.setPackagesToScan("com.*");
		container.setJpaProperties(getProperties());
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		container.setJpaVendorAdapter(adapter);
		return container;
	}
	@Bean("transactionManager")
	public JpaTransactionManager transactionManager() {
		JpaTransactionManager jtm = new JpaTransactionManager();
		jtm.setEntityManagerFactory(createManager().getObject());
		return jtm;
	} 
	
	public Properties getProperties() {
		Properties p = new Properties();
		p.setProperty("hibernate.hbm2ddl.auto", "validate");
		p.setProperty("hibernate.show_sql", "true");
		return p;
	}
	
}
