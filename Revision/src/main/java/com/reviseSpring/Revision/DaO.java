package com.reviseSpring.Revision;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.reviseSpring.Revision.entity.Student;
import com.reviseSpring.Revision.repository.StudentRepository;

@Component
public class DaO {
	
	
	@Autowired
	private StudentRepository stuRepo;
	
	
	public List<Student> getAll(){
		
		List<Student> students = (List<Student>)stuRepo.findAll();
		
		return students;
	}
}
