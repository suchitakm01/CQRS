package com.techm.service;

import org.springframework.stereotype.Service;

import com.techm.entity.User;

@Service
public interface UserService {
	User createUser(User user);

	void deleteUser(String username);
}
