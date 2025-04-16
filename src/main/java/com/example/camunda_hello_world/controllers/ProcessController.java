package com.example.camunda_hello_world.controllers;

import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/start")
public class ProcessController {

    @Autowired
    private RuntimeService runtimeService;

    @PostMapping("")
    public String startHelloWorld() {
        runtimeService.startProcessInstanceByKey("hello-world");
        return "Hello World process started!";
    }
}
