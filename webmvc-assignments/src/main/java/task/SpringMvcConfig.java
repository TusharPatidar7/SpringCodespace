package task;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@ComponentScan("task")
@Configuration
public class SpringMvcConfig extends WebMvcConfigurationSupport {

}
