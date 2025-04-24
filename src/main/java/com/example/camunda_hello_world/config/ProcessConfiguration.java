package com.example.camunda_hello_world.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ProcessConfiguration {

    @Value("${camunda.bpm.process-startTime}")
    private String processStartTime;

    public String getProcessStartTime() {
        return processStartTime;
    }


}
