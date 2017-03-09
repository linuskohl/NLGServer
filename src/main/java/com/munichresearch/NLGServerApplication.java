package com.munichresearch;

import java.util.EnumSet;

import javax.servlet.DispatcherType;
import javax.servlet.FilterRegistration;

import com.munichresearch.auth.ApiAuthenticator;
import com.munichresearch.auth.ApiUser;
import com.munichresearch.core.NLGenerator;
import com.munichresearch.resources.NLGResource;

import io.dropwizard.Application;
import io.dropwizard.auth.AuthDynamicFeature;
import io.dropwizard.auth.Authenticator;
import io.dropwizard.auth.basic.BasicCredentialAuthFilter;
import io.dropwizard.auth.basic.BasicCredentials;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;


public class NLGServerApplication extends Application<NLGServerConfiguration> {

	private NLGenerator generator;
	
    public static void main(final String[] args) throws Exception {
        new NLGServerApplication().run(args);
    }

    
    
    @Override
    public String getName() {
        return "NLGServer";
    }

    @Override
    public void initialize(final Bootstrap<NLGServerConfiguration> bootstrap) {
    	this.generator = new NLGenerator();
        // TODO: application initialization
    }

	@Override
	public void run(final NLGServerConfiguration configuration, final Environment environment) {
		// TODO: implement application
    	
		 Authenticator<BasicCredentials, ApiUser> baseAuthenticator 
		     = new ApiAuthenticator(configuration.getLogin(), configuration.getPassword());
		
		 environment.jersey().register(new AuthDynamicFeature(
	              new BasicCredentialAuthFilter.Builder<ApiUser>()
	                      .setAuthenticator(baseAuthenticator)
	                      .setRealm("SECURITY")
	                      .buildAuthFilter()));
		
        final NLGResource resource = new NLGResource();
        environment.jersey().register(resource);
    }

}
