package com.munichresearch;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.hibernate.validator.constraints.*;

import java.util.LinkedList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.*;

public class NLGServerConfiguration extends Configuration {
	private int maxLength;
	
	 @NotNull
	 private String login;
	    
	 @NotNull
	 private String password;

    @JsonProperty
    public int getMaxLength() {
        return maxLength;
    }

    @JsonProperty
    public String getLogin() {
        return login;
    }

    @JsonProperty
    public String getPassword() {
        return password;
    }
}
