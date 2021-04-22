package com.example.demo.model;

public class UserBeanDTO {
	private String firstName;
	private String lastName;
	public UserBeanDTO(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName= lastName;
	}

	public String getFirstName() { return this.firstName; }
	public String getLastName() { return this.lastName; }
}

