package com.munichresearch;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class NLGServerApplication extends Application<NLGServerConfiguration> {

    public static void main(final String[] args) throws Exception {
        new NLGServerApplication().run(args);
    }

    @Override
    public String getName() {
        return "NLGServer";
    }

    @Override
    public void initialize(final Bootstrap<NLGServerConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final NLGServerConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
