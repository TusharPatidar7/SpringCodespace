package com.mvc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@ComponentScan("com.mvc")
@Configuration
public class MvcConfiguration extends WebMvcConfigurationSupport{
		
}
