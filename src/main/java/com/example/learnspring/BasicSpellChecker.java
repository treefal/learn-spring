package com.example.learnspring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BasicSpellChecker implements SpellChecker {
    @Override
    public void checkSpelling(String emailMessage) {
        if (emailMessage != null) {
            System.out.println("Checking spelling...");
            System.out.println("Spell Checking Completed!");
        } else {
            throw new RuntimeException("An exception occurred while checking spelling!");
        }
    }
}
