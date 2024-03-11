package app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@ComponentScan("app")
@Configuration
public class SpringWebConfig extends WebMvcConfigurationSupport{

}
