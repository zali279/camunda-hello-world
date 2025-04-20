package com.example.camunda_hello_world.controllers;


import lombok.AllArgsConstructor;
import org.camunda.bpm.engine.RuntimeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/callback")
@AllArgsConstructor
public class CallBackController {
    final private RuntimeService runtimeService;

    @PostMapping("")
    public  String callBack(){
        runtimeService.createMessageCorrelation("callbackReceived").correlate();
        return "callback ...";
    }



}
