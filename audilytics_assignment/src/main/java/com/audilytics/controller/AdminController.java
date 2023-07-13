package com.audilytics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.audilytics.pojo.User;
import com.audilytics.service.UserService;

@RestController
@RequestMapping("/admin")
@CrossOrigin
public class AdminController {
	@Autowired
	UserService userService;

	@GetMapping("/allusers")
	public List<User> getAllUsers() {
		return userService.findAllUsers();
	}
	

	@PutMapping("/validate/{id}")
	public String validateUser(@PathVariable Long id) {
		
		return userService.validateUser(id);
		
	}

}
