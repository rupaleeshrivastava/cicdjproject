package com.springboot.tutorial.springboottutorial.config;

import com.springboot.tutorial.springboottutorial.service.IsRelationalDatabaseCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SharedConfiguration {

    @Bean
    @Conditional(IsRelationalDatabaseCondition.class)
    public SharedConfiguration flywayClone(){
        System.out.println("Bean created for configuration!!!!");
        return new SharedConfiguration();
    }
}
