package com.rest.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.app.entity.User;

import rest.UserRepository;

@Service
public class UserService {
	
	UserRepository userRepository;
	
	@Autowired
	public UserService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	User user = new User();
	
	public void addUser() {
		
		user.setId(101);
		user.setName("Raja");
		user.setEmail("raja123@gmail.com");
		user.setPassword("raja");
		
//		userRepository.save(user);		
	}
	
	public User getUser(long id) {
		return user;
//		return userRepository.getOne(id);
	}
}
