package com.quest.pnext.us.service;

import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import com.quest.pnext.us.model.User;

public interface IUserService {

	public void createUser(User user);

	public Pageable getUser(int page, int size);
	
	public ResponseEntity<User> getUserByUsername(String username);
	
	public void updateUser(User user);
}
