package app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OrderController {

	@PostMapping("/add")
	public String addOrders() {
		return "";
	}
}
