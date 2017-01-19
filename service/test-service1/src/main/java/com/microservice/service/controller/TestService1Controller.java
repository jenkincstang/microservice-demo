package com.microservice.service.controller;

import com.microservice.service.TestService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by miracle on 2017/1/18.
 */
@RestController
@RequestMapping("/test")
public class TestService1Controller {
    @Autowired
    TestService testService;

    @RequestMapping("/service1")
    @HystrixCommand(fallbackMethod = "fallbackMethod")
    public String service1(){
        return testService.test();
    }


    public String fallbackMethod(){
        return "fail";
    }
}
