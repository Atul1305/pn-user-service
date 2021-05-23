package com.quest.pnext.us.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.quest.pnext.us.model.User;
import com.quest.pnext.us.service.IUserService;

@RequestMapping("/user")

public class UserController {
	
	Logger logger = LogManager.getLogger(UserController.class);
	
	@Autowired
	IUserService userService;

	@PostMapping("/")
	public void createUser(@RequestBody User user) {
		logger.info("Create user have been called: " + user);
		
	}

	@GetMapping("/")
	public ResponseEntity<Pageable> getUser() {
		logger.info("Get user have called.");
		return null;
	}
	
	@GetMapping("/")
	public ResponseEntity<User> getUserByUsername(String username) {
		logger.info("Get user byusername have been called.");
		return null;		
	}
	
	@PutMapping("/")
	public void updateUser(@RequestBody User user) {
		logger.info("Update user have been called." + user);
	}

}
