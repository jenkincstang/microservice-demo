package com.microservice.support;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

/**
 * Created by miracle on 2017/1/17.
 */
@SpringCloudApplication
@EnableZipkinStreamServer
public class SleuthStreamServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SleuthStreamServerApplication.class, args);
    }
}
