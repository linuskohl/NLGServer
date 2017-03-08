package com.munichresearch.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Sentence {
	
	private long id;
    private String content;

    public Sentence(long id, String content) {
    	this.id = id;
        this.content = content;
    }
    
    @JsonProperty("id")
    public long getId() {
        return id;
    }
    
    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    @JsonProperty("content")
    public void setContent(String content) {
        this.content = content;
    }
}