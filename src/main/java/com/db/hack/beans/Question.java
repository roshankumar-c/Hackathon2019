package com.db.hack.beans;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
/**
 * Created by Roshan on 6/4/2019.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "category",
        "question",
        "choices",
        "correctAnswer",
        "questionHint",
        "rationale",
        "difficultyLevel"
})
    public class Question {

        @JsonProperty("category")
        private String category;
        @JsonProperty("question")
        private String question;
        @JsonProperty("questionHint")
        private String questionHint;
        @JsonProperty("rationale")
        private String rationale;
        @JsonProperty("difficultyLevel")
        private String difficultyLevel;
        @JsonProperty("choices")
        private List<String> choices = null;
        @JsonProperty("correctAnswer")
        private Integer correctAnswer;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        @JsonProperty("category")
        public String getCategory() {
            return category;
        }

        @JsonProperty("category")
        public void setCategory(String category) {
            this.category = category;
        }

        @JsonProperty("question")
        public String getQuestion() {
            return question;
        }

        @JsonProperty("question")
        public void setQuestion(String question) {
            this.question = question;
        }

        @JsonProperty("questionHint")
        public String getQuestionHint() {
            return questionHint;
        }

        @JsonProperty("questionHint")
        public void setQuestionHint(String questionHint) {
            this.questionHint = questionHint;
        }

        @JsonProperty("rationale")
        public String getRationale() {
            return rationale;
        }

        @JsonProperty("rationale")
        public void setRationale(String rationale) {
            this.rationale = rationale;
        }

        @JsonProperty("difficultyLevel")
        public String getDifficultyLevel() {
            return difficultyLevel;
        }

        @JsonProperty("difficultyLevel")
        public void setDifficultyLevel(String difficultyLevel) {
            this.difficultyLevel = difficultyLevel;
        }

        @JsonProperty("choices")
        public List<String> getChoices() {
            return choices;
        }

        @JsonProperty("choices")
        public void setChoices(List<String> choices) {
            this.choices = choices;
        }

        @JsonProperty("correctAnswer")
        public Integer getCorrectAnswer() {
            return correctAnswer;
        }

        @JsonProperty("correctAnswer")
        public void setCorrectAnswer(Integer correctAnswer) {
            this.correctAnswer = correctAnswer;
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
