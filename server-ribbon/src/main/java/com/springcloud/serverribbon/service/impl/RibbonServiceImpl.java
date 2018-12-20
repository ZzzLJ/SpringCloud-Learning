package com.springcloud.serverribbon.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonServiceImpl {
    @Autowired
    RestTemplate restTemplate;

    public String loadBalanced() {
        return "ribbon ++ " + restTemplate.getForObject("http://server-client/server-client", String.class);
    }

    @HystrixCommand(fallbackMethod = "hystrixError")
    public String hystrix(){
        return restTemplate.getForObject("http://server-client/server-client", String.class);
    }

    //fallbackMethod熔断方法
    public String hystrixError(){
        return "ribbon hystrix Error";
    }

}
