package com.audilytics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.audilytics.pojo.User;
import com.audilytics.service.UserService;

@RestController
@RequestMapping("/")
@CrossOrigin
public class AuthController {

	@Autowired
	UserService userService;

	@PostMapping("/register")
	public String createUser(@RequestBody User user) {
		return userService.registerUser(user);
	}

	@PostMapping("/login")
	public User signIn(@RequestBody User user) {
		User oldUser = userService.authenticateUser(user.getUsername());
		if (oldUser != null && user.getPassword().equals(oldUser.getPassword()))
			return oldUser;
		else
			return null;
	}
}
