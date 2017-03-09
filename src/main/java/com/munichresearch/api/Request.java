package com.munichresearch.api;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Request {
	private List<String> verbs;
	private List<String> subjects;
	private List<String> objects;

	public Request() {
	}

	@JsonProperty("verbs")
	public List<String> getVerbs() {
		return this.verbs;
	}

	@JsonProperty("verbs")
	public void setVerbs(String[] verbs) {
		this.verbs = Arrays.asList(verbs);
	}

	@JsonProperty("subjects")
	public List<String> getSubjects() {
		return this.subjects;
	}

	@JsonProperty("subjects")
	public void setSubject(String[] subjects) {
		this.subjects = Arrays.asList(subjects);
	}
	
	@JsonProperty("objects")
	public List<String> getObjects() {
		return this.objects;
	}

	@JsonProperty("objects")
	public void setObject(String[] objects) {
		this.objects = Arrays.asList(objects);
	}
}