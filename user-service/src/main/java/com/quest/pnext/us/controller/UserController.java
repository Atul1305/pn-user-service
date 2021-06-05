package com.quest.pnext.us.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quest.pnext.us.constants.Messages;
import com.quest.pnext.us.dto.ResponseDTO;
import com.quest.pnext.us.model.User;
import com.quest.pnext.us.service.IUserService;

@RequestMapping("/user")
@RestController
public class UserController {
	
	Logger logger = LogManager.getLogger(UserController.class);
	
	@Autowired
	IUserService userService;

	@PostMapping("/")
	public ResponseEntity<ResponseDTO> createUser(@RequestBody User user) {
		user = userService.createUser(user);
		return ResponseEntity.ok(new ResponseDTO(Messages.USER_CREATED, user));
		
	}

	@GetMapping("/")
	public ResponseEntity<Page<User>> getUser(@RequestParam int page, @RequestParam int size) {
		return new ResponseEntity<Page<User>>(userService.getUser(page, size), HttpStatus.OK);
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
