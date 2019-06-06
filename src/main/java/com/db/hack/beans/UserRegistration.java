package com.db.hack.beans;

import java.util.ArrayList;
import java.util.List;



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
		"username",
		"password",
		"confimpassword",
		"student_id",
		"first_name",
		"middle_initial",
		"last_name",
		"dob",
		"gender",
		"grade",
		"course"
})
public class UserRegistration {

		@JsonProperty("username")
		private String username;
		@JsonProperty("password")
		private String password;
		@JsonProperty("confimpassword")
		private String confimpassword;
		@JsonProperty("student_id")
		private String studentId;
		@JsonProperty("first_name")
		private String firstName;
		@JsonProperty("middle_initial")
		private String middleInitial;
		@JsonProperty("last_name")
		private String lastName;
		@JsonProperty("dob")
		private String dob;
		@JsonProperty("gender")
		private String gender;
		@JsonProperty("grade")
		private String grade;
		@JsonProperty("course")
		private String course;
		@JsonIgnore
		private Map<String, Object> additionalProperties = new HashMap<String, Object>();

		@JsonProperty("username")
		public String getUsername() {
			return username;
		}

		@JsonProperty("username")
		public void setUsername(String username) {
			this.username = username;
		}

		@JsonProperty("password")
		public String getPassword() {
			return password;
		}

		@JsonProperty("password")
		public void setPassword(String password) {
			this.password = password;
		}

		@JsonProperty("confimpassword")
		public String getConfimpassword() {
			return confimpassword;
		}

		@JsonProperty("confimpassword")
		public void setConfimpassword(String confimpassword) {
			this.confimpassword = confimpassword;
		}

		@JsonProperty("student_id")
		public String getStudentId() {
			return studentId;
		}

		@JsonProperty("student_id")
		public void setStudentId(String studentId) {
			this.studentId = studentId;
		}

		@JsonProperty("first_name")
		public String getFirstName() {
			return firstName;
		}

		@JsonProperty("first_name")
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		@JsonProperty("middle_initial")
		public String getMiddleInitial() {
			return middleInitial;
		}

		@JsonProperty("middle_initial")
		public void setMiddleInitial(String middleInitial) {
			this.middleInitial = middleInitial;
		}

		@JsonProperty("last_name")
		public String getLastName() {
			return lastName;
		}

		@JsonProperty("last_name")
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		@JsonProperty("dob")
		public String getDob() {
			return dob;
		}

		@JsonProperty("dob")
		public void setDob(String dob) {
			this.dob = dob;
		}

		@JsonProperty("gender")
		public String getGender() {
			return gender;
		}

		@JsonProperty("gender")
		public void setGender(String gender) {
			this.gender = gender;
		}

		@JsonProperty("grade")
		public String getGrade() {
			return grade;
		}

		@JsonProperty("grade")
		public void setGrade(String grade) {
			this.grade = grade;
		}

		@JsonProperty("course")
		public String getCourse() {
			return course;
		}

		@JsonProperty("course")
		public void setCourse(String course) {
			this.course = course;
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
