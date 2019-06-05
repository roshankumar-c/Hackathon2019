package com.db.hack.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.db.hack.beans.*;

@Controller
public class UserRegistrationController {
	
	@RequestMapping(method = RequestMethod.POST, value="/register/user")

	
	@ResponseBody
    UserRegistrationReply registerUser(@RequestBody User user) {
		
		System.out.println("In register user");
        UserRegistrationReply stdregreply = new UserRegistrationReply();

        //We are setting the below value just to reply a message back to the caller
        stdregreply.setName(user.getName());
        stdregreply.setAge(user.getAge());
        stdregreply.setRegistrationNumber(user.getRegistrationNumber());
        stdregreply.setRegistrationStatus("Successful");


        return stdregreply;
        
	}

}
