package com.techm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techm.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
