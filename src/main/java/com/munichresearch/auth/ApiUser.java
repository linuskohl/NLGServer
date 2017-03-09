package com.munichresearch.auth;

import java.security.Principal;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApiUser implements Principal {

	public ApiUser() {
		
	}
	    
    @Override
    public String getName() {
        return "";
    }
}
