package com.nhsoft.spring.cloud.eureka.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "appUserService", configuration = YeaFeignConfiguration.class, fallback = HystrixClientFallback.class)
interface FeignDiscoveryClient {

    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    String get();



}

