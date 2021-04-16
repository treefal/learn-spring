package com.example.learnspring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "classpath:/application.properties")
public class AdvancedSpellChecker implements SpellChecker, InitializingBean, DisposableBean {

    @Value("${app.database.uri}")
    private String databaseUri;

    @Override
    public void checkSpelling(String emailMessage) {
        if (emailMessage != null) {
            // Determining the language of the email message
            // Check grammatical errors in the email message
            // Check spellings in the email message
            System.out.println("Spell Checking Completed!!!");

            System.out.println("DB URI: " + databaseUri);
        } else {
            throw new RuntimeException("An exception occurred while checking spelling!");
        }
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroyed Properties!");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Setting Properties after Bean is initialized!");
    }
}
