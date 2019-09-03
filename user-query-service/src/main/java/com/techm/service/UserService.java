package com.techm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.techm.entity.User;

@Service
public interface UserService {
	List<User> getUsers();
}
