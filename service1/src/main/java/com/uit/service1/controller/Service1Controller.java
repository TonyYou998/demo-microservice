package com.uit.service1.controller;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("service1")
@AllArgsConstructor
public class Service1Controller {
    private RestTemplate restTemplate;
    @GetMapping("/demo")
    public Object demo(){
        return  "service1";
    }
    @GetMapping("/call-service")
    public  Object callService2(){

      return   restTemplate.getForObject("http://service2/service-2/get-service2",String.class);
    }


}
