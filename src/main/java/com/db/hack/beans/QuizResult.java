package com.db.hack.beans;

/**
 * Created by Roshan on 6/5/2019.
 */



import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "userid",
        "testscore",
        "quizid"
})
public class QuizResult {

    @JsonProperty("userid")
    private String userid;
    @JsonProperty("testscore")
    private String testscore;
    @JsonProperty("quizid")
    private String quizid;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("userid")
    public String getUserid() {
        return userid;
    }

    @JsonProperty("userid")
    public void setUserid(String userid) {
        this.userid = userid;
    }

    @JsonProperty("testscore")
    public String getTestscore() {
        return testscore;
    }

    @JsonProperty("testscore")
    public void setTestscore(String testscore) {
        this.testscore = testscore;
    }

    @JsonProperty("quizid")
    public String getQuizid() {
        return quizid;
    }

    @JsonProperty("quizid")
    public void setQuizid(String quizid) {
        this.quizid = quizid;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}