package com.biomello.demoparkapi.config;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import java.util.TimeZone;

@Configuration
public class SpringTimezoneConfig {

    @PostConstruct
    public  void timezoneConfig(){
        TimeZone.setDefault(TimeZone.getTimeZone("America/Sao_Paulo"));
    }

    @SpringBootApplication
    public static class DemoParkApiApplication {

        public static void main(String[] args) {
            SpringApplication.run(DemoParkApiApplication.class, args);
        }

    }
}
