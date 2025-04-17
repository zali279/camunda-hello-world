package com.example.camunda_hello_world.controllers;

import lombok.AllArgsConstructor;
import org.camunda.bpm.engine.RuntimeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@AllArgsConstructor
@RestController
@RequestMapping("/start")
public class ProcessController {

    private final RuntimeService runtimeService;

    @PostMapping("")
    public String startHelloWorld() {
        runtimeService.startProcessInstanceByKey("hello-world");
        return "Hello World process started!";
    }
}
