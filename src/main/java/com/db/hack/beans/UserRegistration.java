package com.db.hack.beans;

import java.util.ArrayList;
import java.util.List;

public class UserRegistration {
	
	private String firstName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	private String lastName;
	private String grade;
	private String role;

	private static UserRegistration stdregd = null;
	

	
	public static UserRegistration getInstance() {
		
		if(stdregd == null) {
			stdregd = new UserRegistration();
			return stdregd;
		}
		else {
			return stdregd;
		}
	}


}
