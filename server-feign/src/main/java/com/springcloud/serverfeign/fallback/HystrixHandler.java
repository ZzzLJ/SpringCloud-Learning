package com.springcloud.serverfeign.fallback;

import com.springcloud.serverfeign.service.FeignService;
import org.springframework.stereotype.Component;

@Component      //@Component    保证fallback类被Spring容器扫描到
public class HystrixHandler implements FeignService {
    @Override
    public String TransferAnotherServer() {
        return "feign hystrix Error";
    }

    @Override
    public Boolean deviceIsExists(String deviceId) {
        return null;
    }
}
