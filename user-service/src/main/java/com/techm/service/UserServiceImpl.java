package com.techm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.techm.entity.User;
import com.techm.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public User createUser(User user) {
		
		return userRepository.save(user);
	}

	@Transactional
	@Override
	public void deleteUser(String username) {
		userRepository.deleteByUsername(username);
	}

}
