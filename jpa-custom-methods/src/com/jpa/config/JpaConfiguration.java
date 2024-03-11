package com.jpa.config;

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

@ComponentScan("com.jpa.*")
@EnableJpaRepositories("com.jpa.*")
@Configuration
public class JpaConfiguration {

	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		ds.setUsername("mydb");
		ds.setPassword("buddy");
		return ds;
	}

	@Bean("entityManagerFactory")
	public LocalContainerEntityManagerFactoryBean createEntityManager() {
		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();

		factory.setDataSource(getDataSource());

		factory.setPackagesToScan("com.jpa.*");

		factory.setJpaProperties(hibernateProps());

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

	public Properties hibernateProps() {

		Properties props = new Properties();

		props.setProperty("hibernate.hbm2ddl.auto", "none");
		props.setProperty("hibernate.show_sql", "true");

		return props;
	}
}
