package com.rest.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rest.app.entity.User;
import com.rest.app.services.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	UserService service;
	
	@Autowired
	public UserController(UserService service) {
		super();
		this.service = service;
	}
	
	public UserController() {
		super();
		// TODO Auto-generated constructor stub
	}

	@GetMapping("/add")
	@ResponseBody
	public String registerUser() {
		
		service.addUser();
		
		return "You have registered successfully!";
	}
	
	@GetMapping("/get")
	@ResponseBody
	public User getUserData() {
		return service.getUser(1);
	}
	
}
