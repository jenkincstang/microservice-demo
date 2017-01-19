package com.microservice.service;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by miracle on 2017/1/18.
 */
@EnableFeignClients
@SpringCloudApplication
public class TestService1Application {

    public static void main(String[] args) {
        SpringApplication.run(TestService1Application.class, args);
    }
}