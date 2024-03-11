package com.autowire;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.autowire")
@Configuration
public class ConfigBeans {
	@Bean
	public Address companyAddress() {
		return new Address();
	}
}
