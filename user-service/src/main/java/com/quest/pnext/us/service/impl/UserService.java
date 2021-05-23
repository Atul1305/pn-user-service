package com.quest.pnext.us.service.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.quest.pnext.us.model.User;
import com.quest.pnext.us.service.IUserService;

@Service
public class UserService implements IUserService {

	Logger logger = LogManager.getLogger(UserService.class);

	@Override
	public void createUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Pageable getUser(int page, int size) {
		PageRequest userPage = PageRequest.of(page, size);
		
		return userPage;
	}

	@Override
	public ResponseEntity<User> getUserByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}
	
	
}
