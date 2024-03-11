package fourth;

import java.util.Map;

import org.springframework.stereotype.Component;

@Component("student2")
public class Student {
	
	private int id;
	private String name;
	private Map<String, Integer> marks;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, Integer> getMarks() {
		return marks;
	}
	public void setMarks(Map<String, Integer> marks) {
		this.marks = marks;
	}
	
//	• Create one Bean Configuration with Configuration class and Bean method. 
//	• Create another Bean Configuration with component and component scans. 
//	• Get Both Bean configuration Objects and print Details
}
