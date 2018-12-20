package com.springcloud.serverfeign.service;

import com.springcloud.serverfeign.fallback.CustomFallBackFactory;
import com.springcloud.serverfeign.fallback.HystrixHandler;
import feign.hystrix.FallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * @FeignClient
 * value = "服务名"，指定调用的服务
 * fallback
 * fallbackFactory
 * */
@FeignClient(value = "server-client", fallback = HystrixHandler.class)
//@FeignClient(value = "server-client",fallbackFactory = CustomFallBackFactory.class)
public interface FeignService {
    @RequestMapping("/server-client")
    String TransferAnotherServer();
}
