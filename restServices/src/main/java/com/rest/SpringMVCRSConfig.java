package com.rest;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@ComponentScan("com.rest.*")
@Configuration
@EnableWebMvc
public class SpringMVCRSConfig extends WebMvcConfigurationSupport{
	
}
