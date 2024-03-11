package constructorInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("constructorInjection")
@Configuration
public class Config {
	
	@Bean("address2")
	public Address addBean() {
		return new Address();
	}

}
