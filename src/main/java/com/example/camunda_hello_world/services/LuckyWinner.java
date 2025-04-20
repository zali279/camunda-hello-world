package com.example.camunda_hello_world.services;


import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service("luckyWinner")
public class LuckyWinner implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        boolean isWinner = new Random().nextBoolean(); // randomly true or false
        delegateExecution.setVariable("isWinner", isWinner);
        System.out.println("is winner : " +isWinner);
    }
}
