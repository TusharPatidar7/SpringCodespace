package task.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import task.entity.Student;
import task.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository sRepository;
	
	public String registerStudent(Student s) {
		
		Student student = sRepository.findByEmail(s.getEmail());
		
		if(student==null) {
			sRepository.save(s);
			return s.getFullName()+" Registered, login with email id and password!";
		}
		
		return student.getEmail()+" Already Exists with the provide email.";
	}
	
	public String loginStudent(Student s) {
		
		Student student = sRepository.findByEmailAndPassword(s.getEmail(), s.getPassword());
		if(student != null) {
			return "Welcome "+student.getFullName();
		}
		
		return "Incorrect email or password!";
	}
}
