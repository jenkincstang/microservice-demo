package com.microservice.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by miracle on 2017/1/17.
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/service")
    public String test(){
        ResponseEntity<Object> forEntity = this.restTemplate.getForEntity("http://www.baidu.com", null, String.class);
        return "test service";
    }
}
