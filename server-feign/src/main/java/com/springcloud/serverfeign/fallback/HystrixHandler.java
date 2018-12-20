package com.springcloud.serverfeign.fallback;

import com.springcloud.serverfeign.service.FeignService;
import org.springframework.stereotype.Component;

@Component      //@Component
public class HystrixHandler implements FeignService {
    @Override
    public String TransferAnotherServer() {
        return "feign hystrix Error";
    }
}
