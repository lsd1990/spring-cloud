package com.nhsoft.spring.cloud.eureka.consumer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableEurekaClient
@EnableFeignClients
@EnableCircuitBreaker
public class ConsumerApplication {

    @Autowired
    private OrganizationDiscoveryClient organizationDiscoveryClient;

    @Autowired
    private FeignDiscoveryClient feignDiscoveryClient;

    @GetMapping("/call")
    public String call() {

        return organizationDiscoveryClient.get();
    }

    @GetMapping("/callViaFeign")
    public String callViaFeign() {

        return feignDiscoveryClient.get();
    }

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
