package com.techm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techm.entity.User;
import com.techm.service.UserService;

@RestController
public class UserQueryController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/user")
	public List<User> createUser() {
		return userService.getUsers();
	}
}
