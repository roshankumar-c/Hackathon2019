package com.db.hack.databse;

import com.db.hack.beans.Question;
import com.db.hack.data.retrieval.QuestionsRetrieval;
import com.db.hack.json.JsonData;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

/**
 * Created by Roshan on 6/4/2019.
 */
public class TestDB {

    public static void main(String[] args) {

        DatabaseConnectionFactory dc = new DatabaseConnectionFactory("team7User", "HAckCaryTeam7");
        QuestionsRetrieval questionsRetrieval = new QuestionsRetrieval(dc);
        List<Question> questionList = questionsRetrieval.getAllQuestions();
        System.out.println("===-->> "+questionList.size());
        JsonData jsondata = new JsonData();
        try {
            System.out.println(jsondata.getQuestionsJson(questionList));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }


    }
}
