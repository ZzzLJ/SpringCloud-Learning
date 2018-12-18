package com.springcloud.serverribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class LoadBalancedController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/loadBalanced")
    public String test() {
        return restTemplate.getForObject("http://server-client/server-client", String.class);
    }
}
