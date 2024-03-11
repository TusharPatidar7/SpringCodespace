package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/other")
@Controller
public class PaymentController{

	@RequestMapping(path = "/pay", method =RequestMethod.POST)
	@ResponseBody
	public String makePayment() {
		return "Payment Successfully done!";
	}
	
	@RequestMapping(path = "/add", method =RequestMethod.PUT)
	@ResponseBody
	public String enterDetails() {
		return "Added Details!";
	}
	
	
}
