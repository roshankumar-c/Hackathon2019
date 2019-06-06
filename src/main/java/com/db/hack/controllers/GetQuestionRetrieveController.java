package com.db.hack.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.db.hack.beans.GetQuestion;
import com.db.hack.beans.Question;
import com.db.hack.data.retrieval.QuestionsRetrieval;
import com.db.hack.databse.DatabaseConnectionFactory;
import com.db.hack.json.JsonData;
import com.fasterxml.jackson.core.JsonProcessingException;

@Controller
public class GetQuestionRetrieveController {
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/getQuestions")
	@ResponseBody
	public String getQuestions(@RequestBody GetQuestion getQuestion) {
		
		String finalQuestion = "";
		DatabaseConnectionFactory dc = new DatabaseConnectionFactory("team7User", "HAckCaryTeam7");
		QuestionsRetrieval questionsRetrieval = new QuestionsRetrieval(dc);
		List<Question> questionList = null;
		if (null == getQuestion || getQuestion.getLevel() == null || getQuestion.getTopic() == null) {
			
			questionList = questionsRetrieval.getAllQuestions();
		}else {
			questionList = questionsRetrieval.getFilteredQuestions(getQuestion);
		}
		
		
	
		JsonData jsondata = new JsonData();
		try {
			System.out.println("===-->> "+questionList.size());
			finalQuestion = jsondata.getQuestionsJson(questionList);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		return finalQuestion;
	}

}
