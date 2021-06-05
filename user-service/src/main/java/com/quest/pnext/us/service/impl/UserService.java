package com.quest.pnext.us.service.impl;

import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.quest.pnext.us.constants.Messages;
import com.quest.pnext.us.dto.ResponseDTO;
import com.quest.pnext.us.model.User;
import com.quest.pnext.us.repository.UserRepository;
import com.quest.pnext.us.service.IUserService;

@Service
public class UserService implements IUserService {

	Logger logger = LogManager.getLogger(UserService.class);
	
	@Autowired
	UserRepository userRepository;

	@Override
	public User createUser(User user) {
		logger.info("Create user have been called: " + user);
		User createdUser = userRepository.save(user);
		logger.info(Messages.USER_CREATED);
		return createdUser;
	}

	@Override
	public Page<User> getUser(int pageNumber, int size) {
		logger.info(Messages.USER_GET);
		PageRequest userPageRequest = PageRequest.of(pageNumber, size);
		Page<User> userPage = userRepository.findAll(userPageRequest);
		return userPage;
	}

	@Override
	public ResponseEntity<?> getUserByUsername(String username) {
		Optional<User> userOptional = userRepository.findByUsername(username);
		if(userOptional.isPresent()) {
			return ResponseEntity.ok(userOptional.get());
		}else {
			return new ResponseEntity<ResponseDTO>(new ResponseDTO("User with username [" + username + "] does not found.", null), HttpStatus.NOT_FOUND);
		}
	}

	@Override
	public void updateUser(User user) {
		// TODO update it Mapper
		
	}
}
