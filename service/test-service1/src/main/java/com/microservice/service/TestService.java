package com.microservice.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.microservice.service.TestService.TEST_SERVICE;

/**
 * Created by miracle on 2017/1/18.
 */
@FeignClient(value = TEST_SERVICE, fallback = TestServiceHystrix.class)
public interface TestService {
    String TEST_SERVICE = "test-service";

    @RequestMapping("/test/service")
    String test();

}
