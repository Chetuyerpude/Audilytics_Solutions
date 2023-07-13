package com.audilytics.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.audilytics.pojo.User;
import com.audilytics.repo.UserRepo;

@Service
@Transactional
public class UserServiceImplementation implements UserService {

	@Autowired
	UserRepo userRepo;

	@Override
	public String registerUser(User user) {
		user.setRole("user");
		user.setValidated(false);
		userRepo.save(user);

		return "User registered Succussefully";
	}

	@Override
	public User authenticateUser(String username) {

		return userRepo.findByUsername(username);

	}

	@Override
	public String updateUser(User newUser, Long id) {
		// TODO Auto-generated method stub
		User oldUser = userRepo.findById(id).orElseThrow(() -> new RuntimeException("id not found"));

		oldUser.setUsername(newUser.getUsername());
		oldUser.setPassword(newUser.getPassword());
		oldUser.setFirstName(newUser.getFirstName());
		oldUser.setLastName(newUser.getLastName());
		oldUser.setAddressLine1(newUser.getAddressLine1());
		oldUser.setAddressLine2(newUser.getAddressLine2());
		oldUser.setDob(newUser.getDob());
		oldUser.setPostalCode(newUser.getPostalCode());
		oldUser.setPhoneNumber(newUser.getPhoneNumber());
		userRepo.save(oldUser);
		return "User updated successfully";
	}

	@Override
	public User userDetails(Long id) {
		User user = userRepo.findById(id).orElseThrow(() -> new RuntimeException("user not found"));

		return user;
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		String role = "user";
		return userRepo.findByRole(role);
	}

	@Override
	public String validateUser(Long id) {
		User user= userRepo.findById(id).orElseThrow(()-> new RuntimeException("user not found"));
		user.setValidated(true);
		userRepo.save(user);
		return "User validated successfully";
	}

}
