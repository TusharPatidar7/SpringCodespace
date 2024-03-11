package fourth;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FConfig {
	
	@Bean("student1")
	public Student createStudent() {
		Student s = new Student();
		s.setId(101);
		s.setName("Raja");
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Maths", 95);
		map.put("English", 85);
		map.put("Physics", 70);
		map.put("Java", 75);
		
		s.setMarks(map);
		
		return s;
	}
}
