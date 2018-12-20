package com.springcloud.serverfeign.controller;

import com.springcloud.serverfeign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    //编译器报错，因为这个实在程序启动时注入的，编译器检测不到，所以报错
    @Autowired
    private FeignService feignService;

    @RequestMapping("/server-feign")
    public String test(){
        return "feign ++ " + feignService.TransferAnotherServer();
    }
}
