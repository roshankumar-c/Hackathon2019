package com.db.hack.controllers;

import com.db.hack.beans.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.db.hack.beans.UserRegistration;

@Controller
public class UserUpdateController {
	
@RequestMapping(method = RequestMethod.PUT, value="/update/student")

	
	@ResponseBody
	public String updateStudentRecord(@RequestBody User stdn) {
		System.out.println("In updateStudentRecord");	   
	    return "";
	}	

}
