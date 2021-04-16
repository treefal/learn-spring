package com.example.learnspring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class JavaLifecycleHooks {

    @PostConstruct
    public void init() {
        System.out.println("Inside init JavaLifecycle Hook");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Inside destroy JavaLifecycle Hook");
    }
}
