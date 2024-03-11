package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MvcController {

	@RequestMapping("/get")
	@ResponseBody
	public String getGreatings() {
		return "Hello, Welcome To Spring-Mvc! Enjoy Your Learnings!";
	}
	
	@RequestMapping("/")
	@ResponseBody
	public String startupMsg() {
		return "Hit the \"/get\" url!";
	}
}
