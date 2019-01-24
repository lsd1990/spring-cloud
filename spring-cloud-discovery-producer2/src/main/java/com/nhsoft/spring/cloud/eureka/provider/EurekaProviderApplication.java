package com.nhsoft.spring.cloud.eureka.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableEurekaClient
public class EurekaProviderApplication {
	
	@RequestMapping("/hello")
	public String hello() {
		int i = 1/0;
		return "hello world, lsd, cluter " + System.getProperty("spring.profiles.active");
	}

	public static void main(String[] args) {
		SpringApplication.run(EurekaProviderApplication.class, args);
	}
}
