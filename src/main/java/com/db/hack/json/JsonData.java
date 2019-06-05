package com.db.hack.json;

import com.db.hack.beans.Question;
import com.db.hack.beans.Questions;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

/**
 * Created by Roshan on 6/4/2019.
 */
public class JsonData {

    public String getQuestionsJson(List<Question> questions) throws JsonProcessingException {


        ObjectMapper mapper = new ObjectMapper();
        // Java object to JSON string
        Questions qsFinal = new Questions();
        qsFinal.setQuestions(questions);
        return mapper.writeValueAsString(qsFinal);

        /*String startString = "{" +
                "Questions:" +
                "[";

        String endString = "]" +
                "}";
        String questionString = "";
        for(Question question : questions)
        {
            ObjectMapper mapper = new ObjectMapper();
            // Java object to JSON string
            questionString += mapper.writeValueAsString(question);

        }

    return startString + questionString + endString;*/

    }
}
