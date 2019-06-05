package com.db.hack.beans;

import java.util.ArrayList;
import java.util.List;

public class UserRegistration {
	
	private List<User> userRecords;
	
	private static UserRegistration stdregd = null;
	
	private UserRegistration(){
		userRecords = new ArrayList<User>();
	}
	
	public static UserRegistration getInstance() {
		
		if(stdregd == null) {
			stdregd = new UserRegistration();
			return stdregd;
		}
		else {
			return stdregd;
		}
	}
	
	public void add(User std) {
		userRecords.add(std);
	}
	
	public String upDateStudent(User std) {
		
		for(int i = 0; i< userRecords.size(); i++)
        {
            User stdn = userRecords.get(i);
            System.out.println(stdn.getRegistrationNumber());
            System.out.println(std.getRegistrationNumber());
            if(stdn.getRegistrationNumber().equals(std.getRegistrationNumber())) {
            	userRecords.set(i, std);//update the new record
            	return "Update successful";
            }
        }
		
		return "Update un-successful";
		
	}
	
	public String deleteStudent(String registrationNumber) {
		
		for(int i = 0; i< userRecords.size(); i++)
        {
            User stdn = userRecords.get(i);
            if(stdn.getRegistrationNumber().equals(registrationNumber)) {
            	userRecords.remove(i);//update the new record
            	return "Delete successful";
            }
        }
		
		return "Delete un-successful";
		
	}

	public List<User> getUserRecords() {
		return userRecords;
	}

}
