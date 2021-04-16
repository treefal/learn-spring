package com.example.learnspring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class AdvancedSpellChecker implements SpellChecker {
    @Override
    public void checkSpelling(String emailMessage) {
        if (emailMessage != null) {
            // Determining the language of the email message
            // Check grammatical errors in the email message
            // Check spellings in the email message
            System.out.println("Spell Checking Completed!!!");
        } else {
            throw new RuntimeException("An exception occurred while checking spelling!");
        }
    }
}
