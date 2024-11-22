package com.example.web_serviceTP.ressourceConfig;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.web_serviceTP.controllers.CompteRestJaxRSAPI;

@Configuration
public class MyConfig {
    @Bean
    public ResourceConfig resourceConfig() {
        ResourceConfig jerseyConfig = new ResourceConfig();
        jerseyConfig.register(CompteRestJaxRSAPI.class);
        return jerseyConfig;
    }
}
