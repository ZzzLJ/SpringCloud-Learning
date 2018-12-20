package com.springcloud.serverribbon.controller;

import com.springcloud.serverribbon.service.impl.RibbonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {
    @Autowired
    private RibbonServiceImpl ribbonService;

    @RequestMapping(value = {"/loadBalanced","/server-ribbon"})
    public String loadBalanced() {
        return ribbonService.loadBalanced();
    }

    @RequestMapping("/hystrix")
    public String hystrix(){
        return ribbonService.hystrix();
    }
}
