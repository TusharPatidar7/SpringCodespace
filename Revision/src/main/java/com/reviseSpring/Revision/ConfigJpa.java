package com.reviseSpring.Revision;

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

@EnableJpaRepositories("com.reviseSpring.Revision.*")
@ComponentScan("com.reviseSpring.Revision.*")
@Configuration
public class ConfigJpa {

	/*
	 * Jpa Confiuration process includes: 1. create datasource 2. create hibernate
	 * properties 3. create entityManagerFactory 4. create transactionManager
	 */
	@Bean
	public DaO getDao() {
		return new DaO();
	}
	
	@Bean
	public DataSource getDataSource() {

		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		ds.setUsername("mydb");
		ds.setPassword("buddy");

		return ds;
	}

	public Properties hibernateProps() {

		Properties props = new Properties();

		props.setProperty("hibernate.hbm2ddl.auto", "validate");
		props.setProperty("hibernate.show_sql", "true");

		return props;
	}

	@Bean("entityManagerFactory")
	public LocalContainerEntityManagerFactoryBean createEntityManager() {

		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
		factory.setDataSource(getDataSource());
		factory.setJpaProperties(hibernateProps());
		factory.setPackagesToScan("com.reviseSpring.Revision.*");

		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		factory.setJpaVendorAdapter(adapter);

		return factory;
	}

	// Transaction Manager
	@Bean("transactionManager")
	public JpaTransactionManager createTM() {

		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(createEntityManager().getObject());

		return transactionManager;
	}

}
