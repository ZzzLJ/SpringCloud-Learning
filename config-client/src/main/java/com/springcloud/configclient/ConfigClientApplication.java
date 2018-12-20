package com.springcloud.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }

    //#读取远程仓库   ${spring.application.name} + "-" + ${spring.cloud.config.profile} 配置文件的属性
    @Value("${foo}")
    private String value;

    /*@Value("${spring.rabbitmq.host}")
    private String host;

    @Value("${spring.rabbitmq.port}")
    private Integer port;

    @Value("${hystrix.command.default.execution.timeout.enabled}")
    private Boolean timeout;

    @Value("${management.security.enabled}")
    private String security;*/

    @RequestMapping("/getRemoteProperties")
    public String getValue(){
        return value;
        //return host + "--" + port + "--" + timeout + "--" + security;
    }

}

