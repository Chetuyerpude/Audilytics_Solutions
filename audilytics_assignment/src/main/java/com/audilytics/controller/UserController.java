package com.audilytics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.audilytics.pojo.User;
import com.audilytics.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

	@Autowired
	UserService userService;
	

	@PutMapping("/update/{id}")
	public String updateProfile(@RequestBody User user, @PathVariable Long id) {

		return userService.updateUser(user, id);

	}

	@GetMapping("/mydetails/{id}")
	public User getMydDetails(@PathVariable Long id) {

		return userService.userDetails(id);

	}
}
