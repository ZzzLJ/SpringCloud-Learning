package com.springcloud.serverribbon.config;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.Server;
import org.springframework.context.annotation.Configuration;

/*
* ribbon 支持负载均衡，默认的负载均衡策略是轮询
* 自定义负载均衡策略 继承AbstractBalancerRule 重写public Server choose(Object o)方法
* */
//@Configuration
public class CustomLoadBalancerRule extends AbstractLoadBalancerRule {
    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }

    @Override
    public Server choose(Object o) {
        return null;
    }
}
