package com.audilytics.service;

import java.util.List;

import com.audilytics.pojo.User;

public interface UserService {

	public String registerUser (User user);
	public User authenticateUser(String username);
	public String updateUser(User newUser,Long id);
	public User userDetails(Long id);
	public List<User> findAllUsers();
	public String validateUser(Long id);
}
