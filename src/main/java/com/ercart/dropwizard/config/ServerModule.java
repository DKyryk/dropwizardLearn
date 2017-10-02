package com.ercart.dropwizard.config;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Provides;
import com.google.inject.name.Named;

public class ServerModule implements Module {

    public void configure(Binder binder) {
    }

    @Provides
    @Named("message")
    public String provideMessage(ServerConfiguration serverConfiguration) {
        return serverConfiguration.getMessage();
    }
}