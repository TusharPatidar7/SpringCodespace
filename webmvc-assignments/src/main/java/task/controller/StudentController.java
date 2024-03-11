package task.controller;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import task.entity.Student;
import task.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	StudentService service;
		
	@PostMapping("/register")
	@ResponseBody
	public String registerStudent(HttpServletRequest request) {
		Student student = new Student();
		student.setId(new Random().nextLong());
		student.setFullName(request.getParameter("fullname"));
		student.setEmail(request.getParameter("email"));
		student.setMobile(request.getParameter("mobile"));
		student.setPassword(request.getParameter("password"));
		return service.registerStudent(student);
	}
	
	@PostMapping("/login")
	@ResponseBody
	public String loginStudent(HttpServletRequest request) {
		
		Student student = new Student();
		student.setEmail(request.getParameter("email"));
		student.setPassword(request.getParameter("password"));
		return service.loginStudent(student);
	}
	
}
