package com.example.learnspring;

public class LearnSpringApplication {

    public static void main(String[] args) {
        EmailClient emailClient = new EmailClient(new BasicSpellChecker());
        emailClient.sendEmail("Hey! This is my first message.");
        emailClient.sendEmail("Hey! This is my second message.");
    }

}
