package com.abmv.angular.attack.service;

import com.abmv.angular.attack.entities.sql.User;

public interface UserService {

	User registerUser(User u);
	
	User getUserById(Long id);
	
	Iterable<User> getAllUsers();
	
}