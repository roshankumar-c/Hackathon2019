package com.db.hack.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;

import com.db.hack.beans.UserRegistration;

@Controller
public class UserDeleteController {
	
	@RequestMapping(method = RequestMethod.DELETE, value="/delete/student/{regdNum}")
	
	@ResponseBody
	public String deleteStudentRecord(@PathVariable("regdNum") String regdNum) {		
		System.out.println("In deleteStudentRecord");	   
	    return "";
	}	

}
