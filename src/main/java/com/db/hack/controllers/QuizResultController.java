package com.db.hack.controllers;

import com.db.hack.beans.*;
import com.db.hack.data.save.QuizResultSave;
import com.db.hack.databse.DatabaseConnectionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuizResultController {
	
	@RequestMapping(method = RequestMethod.POST, value="/quizresult")

	
	@ResponseBody
    QuizResultReply saveQuizResult(@RequestBody QuizResult quizResult) {

		DatabaseConnectionFactory dc = new DatabaseConnectionFactory("team7User", "HAckCaryTeam7");
		System.out.println("In quizresult");
		QuizResultSave  save  = new QuizResultSave(dc);
		save.saveQuizResult(quizResult);

        QuizResultReply reply  = new QuizResultReply();

        return reply;
        
	}

}
