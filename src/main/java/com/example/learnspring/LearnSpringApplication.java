package com.example.learnspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LearnSpringApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        EmailClient emailClient = applicationContext.getBean("emailClient", EmailClient.class);
        emailClient.sendEmail("Hey! This is my first message.");
        emailClient.sendEmail("Hey! This is my second message.");
    }

}
