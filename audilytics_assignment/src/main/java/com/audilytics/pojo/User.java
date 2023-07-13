package com.audilytics.pojo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")

public class User extends BaseClass {
	
		
		@Column(name = "user_name", length = 20, nullable = false)
		private String username;
		
		@Column(name = "password", nullable = false)
		private String password;
		
		@Column(name = "first_name", length = 20, nullable = false)
		private String firstName;

		@Column(name = "last_name", length = 20, nullable = false)
		private String lastName;
		@Column(name = "dob", nullable = false)
		private LocalDate dob;
		
		@Column(name = "addess_line1", length = 50, nullable = false)
		private String addressLine1;
		@Column(name = "addess_line2", length = 50, nullable = false)
		private String addressLine2;
		
		@Column(name = "postal_code", length = 7, nullable = false)
		private String postalCode;

		@Column(name = "phone_number", length = 14, nullable = false)
		private String phoneNumber;
		
		@Column(name = "role", length = 7, nullable = false)
		private String role;
		
		@Column(name = "is_validated", nullable = false)
		private boolean isValidated;

}
