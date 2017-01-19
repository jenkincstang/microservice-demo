package com.microservice.service;

import org.springframework.stereotype.Component;

/**
 * Created by miracle on 2017/1/18.
 */
@Component
public class TestServiceHystrix implements TestService{

    @Override
    public String test() {
        return "fail";
    }
}
