package mavenProjectTest;

import java.util.Map;

public class Student {

	private int id;
	private String name;
	private Map<String,Integer> subMarks;
	
	public Student(int id, String name, Map<String, Integer> subMarks) {
		this.id = id;
		this.name = name;
		this.subMarks = subMarks;
	}

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

	public Map<String, Integer> getSubMarks() {
		return subMarks;
	}

	public void setSubMarks(Map<String, Integer> subMarks) {
		this.subMarks = subMarks;
	}
	
	
}
