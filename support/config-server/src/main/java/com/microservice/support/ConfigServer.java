package com.microservice.support;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import javax.annotation.PostConstruct;

/**
 * Created by miracle on 2017/1/17.
 */
@SpringCloudApplication
@EnableConfigServer
public class ConfigServer implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConfigServer.class);

    public static void main(String[] args) {
        SpringApplication.run(ConfigServer.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        LOGGER.info("配置服务器开始启动...");
    }

    @PostConstruct
    public void started() {
        LOGGER.info("配置服务器启动完毕...");
    }
}
