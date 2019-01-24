package com.nhsoft.spring.cloud.eureka.consumer;

import org.springframework.stereotype.Component;

@Component
public class HystrixClientFallback implements FeignDiscoveryClient {

    @Override
    public String get() {
        return "fail";
    }
}