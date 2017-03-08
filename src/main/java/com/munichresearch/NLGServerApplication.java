package com.munichresearch;

import com.munichresearch.core.NLGenerator;
import com.munichresearch.resources.NLGResource;

import io.dropwizard.Application;
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
    public void run(final NLGServerConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
        final NLGResource resource = new NLGResource();
        environment.jersey().register(resource);
    }

}
