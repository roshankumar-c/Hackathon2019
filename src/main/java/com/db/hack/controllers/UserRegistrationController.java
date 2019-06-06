package com.db.hack.controllers;

import com.db.hack.data.save.UserRegistrationSave;
import com.db.hack.databse.DatabaseConnectionFactory;
import com.db.hack.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.db.hack.beans.*;

@Controller
public class UserRegistrationController {
	
	@RequestMapping(method = RequestMethod.POST, value="/register")

	
	@ResponseBody
    Boolean registerUser(@RequestBody UserRegistration userReg) {
		
		System.out.println("In register user");
        DatabaseConnectionFactory dc = new DatabaseConnectionFactory("team7User", "HAckCaryTeam7");
        UserRegistrationSave register  = new UserRegistrationSave(dc);
        return register.registerUser(userReg);
        
	}

}
