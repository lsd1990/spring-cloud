package com.nhsoft.spring.cloud.eureka.consumer;


import com.netflix.appinfo.InstanceInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class OrganizationDiscoveryClient {

    @Autowired
    private DiscoveryClient discoveryClient;

    public String get(){

        RestTemplate restTemplate = new RestTemplate();

        List<ServiceInstance>  instanceInfos = discoveryClient.getInstances("appUserService");


        if(instanceInfos != null && instanceInfos.size() > 0) {

            String uri = instanceInfos.get(0).getUri().toString() + "/hello";
            ResponseEntity<String> restExchange = restTemplate.exchange(uri, HttpMethod.GET, null, String.class);

            return restExchange.getBody();
        }

        return null;
    }
}
