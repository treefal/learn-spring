package com.example.learnspring;

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
