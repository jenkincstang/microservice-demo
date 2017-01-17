package com.microservice.support;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by miracle on 2017/1/17.
 *
 * @author Miracle.XJH
 * @title DiscoveryServerApplication
 * @date 2017年01月17日 12:58:16
 */
@SpringCloudApplication
@EnableEurekaServer
public class DiscoveryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryServerApplication.class, args);
    }
}
