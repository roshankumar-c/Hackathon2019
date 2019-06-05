package com.db.hack.controllers;

import java.util.List;

import com.db.hack.beans.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.db.hack.beans.UserRegistration;

@Controller
public class UserRetrieveController {
	
	@RequestMapping(method = RequestMethod.GET, value="/student/allstudent")

	@ResponseBody
	public List<User> getStudent() {
		return UserRegistration.getInstance().getUserRecords();
	}

}
