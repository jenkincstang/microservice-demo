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
 * 分布式配置服务器
 *
 * @author Miracle.XJH
 * @title ConfigServerApplication
 * @date 2017年01月17日 12:54:36
 */
@SpringCloudApplication
@EnableConfigServer
public class ConfigServerApplication implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConfigServerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
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
