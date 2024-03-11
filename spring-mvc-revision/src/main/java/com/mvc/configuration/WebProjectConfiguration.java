package com.mvc.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@ComponentScan("com.mvc.*")
@Configuration
@EnableWebMvc
public class WebProjectConfiguration extends WebMvcConfigurationSupport{

}
