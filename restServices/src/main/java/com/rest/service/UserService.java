package com.rest.service;

import org.springframework.stereotype.Service;

import com.rest.dto.UserInformaion;
import com.rest.entity.User_data;
import com.rest.repository.UserRepository;
import com.rest.request.UserCreationRequest;

@Service
public class UserService {
	
	UserRepository userRepo;
		
	public UserService(UserRepository userRepo) {
		super();
		this.userRepo = userRepo;
	}

	public String createUser(UserCreationRequest request) {

		User_data user = new User_data();
		user.setName(request.getName());
		user.setCity(request.getCity());
		user.setContact(request.getContact());
		user.setEmail(request.getEmail());
		user.setPassword(request.getPassword());
		user.setGender(request.getGender());
		
		userRepo.save(user);
		
		
		String result = "User Created Succesfully.";

		// TODO : Adding Repository Layer

		return result;
	}

	public UserInformaion loaadUSerInformation(String email) {

		// TODO : Repository
		// send email to repository
		// findById(email);

		// entity Object
		// convert entity Object to a regular java OBject
		UserInformaion information = new UserInformaion();
		information.setEmail("dilip@gmail.com");
		information.setName("Dilip Singh");
		information.setCity("Hyd");
		information.setContact(8826111377l);
		information.setGender("MALE");
		information.setPassword("dilip123");
		
		// returning to Controller method
		return information;

	}
}
