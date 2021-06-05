package com.quest.pnext.us.service;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

import com.quest.pnext.us.model.User;

public interface IUserService {

	public User createUser(User user);

	public Page<User> getUser(int page, int size);
	
	public ResponseEntity<?> getUserByUsername(String username);
	
	public void updateUser(User user);
}
