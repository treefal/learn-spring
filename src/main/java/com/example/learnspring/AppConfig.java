package com.example.learnspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.learnspring")
public class AppConfig {

    @Bean(name = "basicSpellChecker", initMethod = "init", destroyMethod = "destroy")
    public BasicSpellChecker createBasicSpellChecker() {
        return new BasicSpellChecker();
    }
//
//    @Bean(name = "advancedSpellChecker")
//    public AdvancedSpellChecker createAdvancedSpellChecker() {
//        return new AdvancedSpellChecker();
//    }
//
//    @Bean(name = "emailClient")
//    public EmailClient createEmailClient() {
//        EmailClient emailClient = new EmailClient();
//        emailClient.setSpellChecker(createAdvancedSpellChecker());
//        return emailClient;
//    }
}
