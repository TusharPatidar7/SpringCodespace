package lifeCycleOfBean;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Patient {
	private String name;
	private int age;
	
	@PostConstruct
	public void init() {
		System.out.println("init() method using @PostConstruct");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("destroy() method using @PreDestroy");
	}
}
