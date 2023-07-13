package com.audilytics.pojo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class BaseClass {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
}