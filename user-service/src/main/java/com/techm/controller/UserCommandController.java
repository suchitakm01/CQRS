package com.techm.controller;

import java.sql.SQLException;

import org.h2.tools.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.techm.entity.User;
import com.techm.service.UserService;

@RestController
public class UserCommandController {
	
	@Bean(initMethod = "start", destroyMethod = "stop")
	public Server inMemoryH2DatabaseaServer() throws SQLException {
	    return Server.createTcpServer(
	      "-tcp", "-tcpAllowOthers", "-tcpPort", "9090");
	}
	
	@Autowired
	private UserService userService;

	@PostMapping("/user")
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	
	@DeleteMapping("/user/{username}")
	public void deleteUser(@PathVariable String username) {
		userService.deleteUser(username);
	}
}
