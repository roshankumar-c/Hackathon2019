package com.db.hack.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.db.hack.Exception.AuthorizationException;
import com.db.hack.data.login.Login;
import com.db.hack.databse.DatabaseConnectionFactory;
import com.db.hack.service.LoginService;

@RestController	
public class LoginController {
	
	@RequestMapping(method = RequestMethod.POST, value = "/login/")
	@ResponseBody
	public Boolean authentication(@RequestBody Login login) {
		System.out.println("In authentication");
	//	return UserRegistration.getInstance().upDateStudent(stdn);
		
		DatabaseConnectionFactory dc = new DatabaseConnectionFactory("team7User", "HAckCaryTeam7");
		System.out.println("In quizresult");
		LoginService  loginService  = new LoginService(dc);
		
		return loginService.authenticate(login);
		
		
	}

}
