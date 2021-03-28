package com.tran.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("persons")
public class Member {

	private Long index;
	private String name;
	private boolean isActive;
	private Long age;
	private String gender;
	private String eyeColor;
	private String favoriteFruit;
	private Company company;
	
	@Data
	public class Company {
		private String title;
		private String email;
		private String phone;
	}
	
}