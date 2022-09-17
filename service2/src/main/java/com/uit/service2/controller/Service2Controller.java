package com.uit.service2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("service-2")
public class Service2Controller {
    @GetMapping("/demo")
    public Object demo(){
        return "service2";
    }

    @GetMapping("/get-service2")
    public Object getService2(){
        return "get service 2";

    }
}
