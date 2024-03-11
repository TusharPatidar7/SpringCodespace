package com.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rest.dto.UserInformaion;
import com.rest.request.UserCreationRequest;
import com.rest.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userService;

	//1. Create User Accoiunt 
	@PostMapping("/user/create")
	@ResponseBody  // java to JSON
	//How to get Request Data : @RequestBody : JSON to Java 	
	public String createUser(@RequestBody UserCreationRequest  request) {
		
		// TODO: Object Ready : Send it to Service Repo..  etc... 
		System.out.println("Received Data From Cleint : "+ request );
	
		String response = userService.createUser(request);
		
		return response;
	}

	// TODO 
	// 2nd REST Service : get user information from Database with email id
	@GetMapping("/user/load")
	@ResponseBody  // Java object to JAOn Object 
	public UserInformaion loaadUSerInformation() {

		String email = "dilip@gmail.com";

		UserInformaion informaion = userService.loaadUSerInformation(email);

		System.out.println(informaion);
		return informaion;
	}

	
	// 3rd  REST Service : get user information from Database with city
	
	// 4rd  REST Service : get user information from Database with gender 
}
