package com.springboot.tutorial.springboottutorial.service;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class IsRelationalDatabaseCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return databaseUrlSet(context);
    }

    public boolean databaseUrlSet(ConditionContext context){
        return context.getEnvironment().containsProperty("spring.datasource.url");
    }
}
