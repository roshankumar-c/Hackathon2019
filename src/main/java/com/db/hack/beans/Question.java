package com.db.hack.beans;

/**
 * Created by Roshan on 6/4/2019.
 */
public class Question {

    private Integer questionId;
    private String question;
    private String optionOne;
    private String optionTwo;

    public Question(Integer questionId, String question, String optionOne, String optionTwo, String optionThree, String optionFour, String correct_answer, String topic, String grade, String difficulty_level, String rationale, String question_hint) {
        this.questionId = questionId;
        this.question = question;
        this.optionOne = optionOne;
        this.optionTwo = optionTwo;
        this.optionThree = optionThree;
        this.optionFour = optionFour;
        this.correct_answer = correct_answer;
        this.topic = topic;
        this.grade = grade;
        this.difficulty_level = difficulty_level;
        this.rationale = rationale;
        this.question_hint = question_hint;
    }

    private String optionThree;
    private String optionFour;
    private String correct_answer;
    private String topic;

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOptionOne() {
        return optionOne;
    }

    public void setOptionOne(String optionOne) {
        this.optionOne = optionOne;
    }

    public String getOptionTwo() {
        return optionTwo;
    }

    public void setOptionTwo(String optionTwo) {
        this.optionTwo = optionTwo;
    }

    public String getOptionThree() {
        return optionThree;
    }

    public void setOptionThree(String optionThree) {
        this.optionThree = optionThree;
    }

    public String getOptionFour() {
        return optionFour;
    }

    public void setOptionFour(String optionFour) {
        this.optionFour = optionFour;
    }

    public String getCorrect_answer() {
        return correct_answer;
    }

    public void setCorrect_answer(String correct_answer) {
        this.correct_answer = correct_answer;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDifficulty_level() {
        return difficulty_level;
    }

    public void setDifficulty_level(String difficulty_level) {
        this.difficulty_level = difficulty_level;
    }

    public String getRationale() {
        return rationale;
    }

    public void setRationale(String rationale) {
        this.rationale = rationale;
    }

    public String getQuestion_hint() {
        return question_hint;
    }

    public void setQuestion_hint(String question_hint) {
        this.question_hint = question_hint;
    }

    private String difficulty_level;
    private String rationale;
    private String question_hint;
    private String grade;


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
