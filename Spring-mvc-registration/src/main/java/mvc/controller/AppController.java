package mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mvc.dto.UserRequest;
import mvc.service.UserService;

@Controller
@RequestMapping("/user")
public class AppController {

	@Autowired
	UserService service;
	
	//1. Loading Registration page
	@GetMapping("/")
	public String loadRegistraionPage() {
		return "RegisterUser";
	}

	@RequestMapping(path = "/create", method = RequestMethod.POST)
	public String createUser(Model model, HttpServletRequest request) {

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mno");
		String username = request.getParameter("username");
		String password = request.getParameter("pword");

		UserRequest user = new UserRequest(name, email, mobile, username, password);

		String msg = service.userCreation(user);

		model.addAttribute("result", msg);
		return "welcome";
	}

	@GetMapping("/hey")
	public String sayHello() {
		return "welcome";
	}

	
	//login Page

	// 1. loading UI of Login
	@GetMapping("/login")
	public String loadLoginPage() {

		return "Login";
	}

	@RequestMapping(path = "/loginUser", method = RequestMethod.POST)
	public String loadLoginPage(Model map, HttpServletRequest request) {

		String email = request.getParameter("email");
		String password = request.getParameter("pword");
		UserRequest loginData = new UserRequest(email, password);

		String loginStatus = service.loginUser(loginData);

		map.addAttribute("result", loginStatus);

		return "Home";
	}
}
