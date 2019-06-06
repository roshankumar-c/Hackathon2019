package com.db.hack.data.retrieval;

import com.db.hack.beans.GetQuestion;
import com.db.hack.beans.Question;
import com.db.hack.databse.DatabaseConnectionFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roshan on 6/4/2019.
 */
public class QuestionsRetrieval {

    private DatabaseConnectionFactory dataBaseConnectionFactory;

    public QuestionsRetrieval(DatabaseConnectionFactory daataBaseConnectionFactory) {
        this.dataBaseConnectionFactory = daataBaseConnectionFactory;
    }



    public List<Question> getAllQuestions() {
        List<Question> questionsList = new ArrayList<>();
        Connection conn = dataBaseConnectionFactory.getConnection();
        if (conn!=null)
        {

            try
            {
                Statement select = conn.createStatement();
                ResultSet result=select.executeQuery("Select ID,question,option1,option2,option3,option4,topic," +
                        "grade,difficulty_level,correct_answer,Rationale,question_hint from dbo.Questions");
                while (result.next())
                {
                    Question ques = new Question();
                    ques.setCategory(result.getString("topic"));
                    ques.setCorrectAnswer(result.getInt("correct_answer"));
                    ques.setQuestion(result.getString("question"));
                    List<String> choices = new ArrayList<>();
                    choices.add(result.getString("option1"));
                    choices.add(result.getString("option2"));
                    choices.add(result.getString("option3"));
                    choices.add(result.getString("option4"));
                    ques.setChoices(choices);
                    ques.setQuestionHint(result.getString("question_hint"));
                    ques.setDifficultyLevel(result.getString("difficulty_level"));
                    ques.setRationale(result.getString("Rationale"));
                    questionsList.add(ques);

                    /**
                     * create table dbo.Questions
                     ( ID int PRIMARY KEY IDENTITY(1,1),
                     question nvarchar(500),
                     option1 nvarchar(1000),
                     option2 nvarchar(1000),
                     option3 nvarchar(1000),
                     option4 nvarchar(1000),
                     topic nvarchar(100),
                     grade varchar(20),
                     difficulty_level varchar(10),
                     correct_answer nvarchar(1000),
                     Rationale nvarchar(1000),
                     question_hint nvarchar(1000),
                     )
                     */

                }
            }
            catch(Exception e)
            {
                e.printStackTrace();

            }finally{
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return questionsList;
    }


    public List<Question> getFilteredQuestions(GetQuestion getQuestion) {
        List<Question> questionsList = new ArrayList<>();
        Connection conn = dataBaseConnectionFactory.getConnection();
        if (conn!=null)
        {

            try
            {
                Statement select = conn.createStatement();
                String sql = "Select ID,question,option1,option2,option3,option4,topic," +
                        "grade,difficulty_level,correct_answer,Rationale,question_hint from dbo.Questions where difficulty_level = '" + getQuestion.getLevel()
                        +"' and " + "topic = '"+ getQuestion.getTopic()+"'";
                
                System.out.println(sql);
                ResultSet result=select.executeQuery(sql);
                while (result.next())
                {
                    Question ques = new Question();
                    ques.setCategory(result.getString("topic"));
                    ques.setCorrectAnswer(result.getInt("correct_answer"));
                    ques.setQuestion(result.getString("question"));
                    List<String> choices = new ArrayList<>();
                    choices.add(result.getString("option1"));
                    choices.add(result.getString("option2"));
                    choices.add(result.getString("option3"));
                    choices.add(result.getString("option4"));
                    ques.setChoices(choices);
                    ques.setQuestionHint(result.getString("question_hint"));
                    ques.setDifficultyLevel(result.getString("difficulty_level"));
                    ques.setRationale(result.getString("Rationale"));
                    questionsList.add(ques);

                    /**
                     * create table dbo.Questions
                     ( ID int PRIMARY KEY IDENTITY(1,1),
                     question nvarchar(500),
                     option1 nvarchar(1000),
                     option2 nvarchar(1000),
                     option3 nvarchar(1000),
                     option4 nvarchar(1000),
                     topic nvarchar(100),
                     grade varchar(20),
                     difficulty_level varchar(10),
                     correct_answer nvarchar(1000),
                     Rationale nvarchar(1000),
                     question_hint nvarchar(1000),
                     )
                     */

                }
            }
            catch(Exception e)
            {
                e.printStackTrace();

            }finally{
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return questionsList;
    }

}
