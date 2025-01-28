package com.erhanBalkan.spring_core.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.erhanBalkan.spring_core.config.AppConfig;

public class LoginService {
    public void login(){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);        
        UserService userService = context.getBean(UserService.class);

        
    }
}
