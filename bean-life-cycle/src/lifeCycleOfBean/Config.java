package lifeCycleOfBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("lifeCycleOfBean")
@Configuration
public class Config {
//	
//	@Bean("drA")
//	public Address doctorAddress() {
//		Address ad = new Address();
//		ad.setState("Punjab");
//		return ad;
//	}
}
