package mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mvc.dto.UserRequest;
import mvc.entity.UserDetails;
import mvc.repository.RegisterRepository;

@Service
public class UserService {

	@Autowired
	RegisterRepository repo;
	
	public String userCreation(UserRequest userRequest) {
		
		System.out.println("Service Class : Creating User");
		
		//transferring data to entity class
		UserDetails user = new UserDetails();
		user.setName(userRequest.getName());
		user.setEmail(userRequest.getEmail());
		user.setMno(userRequest.getMno());
		user.setUsername(userRequest.getUsername());
		user.setPassword(userRequest.getPassword());
		
		String msg = null;
		
		if(!repo.findById(userRequest.getEmail()).isPresent()) {
			msg = "Registration Success!";	
		}
		else {
			msg = "You Are Already Registered with this email! Please Login.";
		}		
		repo.save(user);
		return msg;
	}

	public String loginUser(UserRequest userRequest) {

		
		
		String msg = null;
		
		List<UserDetails> list = repo.checkCredentials(userRequest.getEmail(), userRequest.getPassword());
		

		if(!list.isEmpty()) {
			msg = "Login Success!";
		}
		else {
			msg = "Invalid Username/Password, retry!";
		}		
		return msg;
	}
}
