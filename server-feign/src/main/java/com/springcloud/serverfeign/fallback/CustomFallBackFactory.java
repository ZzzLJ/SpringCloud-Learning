package com.springcloud.serverfeign.fallback;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/*
*   Feign中使用断路器
* 这里主要是处理异常出错的情况(降级/熔断时服务不可用，fallback就会找到这里来)
* */
//@Component
public class CustomFallBackFactory<T> implements FallbackFactory<T> {
    @Override
    public T create(Throwable throwable) {
        return null;
    }
}
