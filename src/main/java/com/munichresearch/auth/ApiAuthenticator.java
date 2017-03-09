package com.munichresearch.auth;

import io.dropwizard.auth.AuthenticationException;
import io.dropwizard.auth.Authenticator;
import io.dropwizard.auth.basic.BasicCredentials;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class ApiAuthenticator implements Authenticator<BasicCredentials, ApiUser> {

	private String login;
	private String password;

	public ApiAuthenticator(String login, String password) {
		this.login = login;
		this.password = password;
	}

	@Override
	public Optional<ApiUser> authenticate(BasicCredentials credentials) throws AuthenticationException {
		if (password.equals(credentials.getPassword()) && login.equals(credentials.getUsername())) {
			return Optional.of(new ApiUser());
		} else {
			return Optional.empty();
		}
	}
}