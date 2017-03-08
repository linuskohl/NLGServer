package com.munichresearch.api;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Request {
	private List<String> verbs;
	private List<String> nouns;

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

	@JsonProperty("nouns")
	public List<String> getNouns() {
		return this.nouns;
	}

	@JsonProperty("nouns")
	public void setNouns(String[] nouns) {
		this.nouns = Arrays.asList(nouns);
	}
}