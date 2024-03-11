package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserManagementClass {
	@RequestMapping("/user/login")
	@ResponseBody
	public String loginUser() {
		return "Welcome to Homepage";
	}
}
