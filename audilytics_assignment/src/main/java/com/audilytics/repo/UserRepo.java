package com.audilytics.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.audilytics.pojo.User;
@Repository
public interface UserRepo extends JpaRepository<User, Long> {

	User findByUsername(String username);
	List <User> findByRole(String role);
}
