package com.example.camunda_hello_world.services;

import org.springframework.stereotype.Component;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

@Component("helloWorld")
public class HelloWorld implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.println("Hello World !!");
    }
}