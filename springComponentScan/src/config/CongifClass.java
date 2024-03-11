package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import university.University;

@ComponentScan(basePackages = {"college","config","school","university"})
@Configuration
public class CongifClass {

	@Scope("prototype")
	@Bean(name = {"davv","sage"})
	public University create() {
		return new University();
	}
}
