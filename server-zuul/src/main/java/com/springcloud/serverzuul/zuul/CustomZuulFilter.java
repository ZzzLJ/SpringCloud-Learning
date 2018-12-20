package com.springcloud.serverzuul.zuul;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/*
* 服务过滤
* */
@Component
public class CustomZuulFilter extends ZuulFilter {
    private static final Logger logger = LoggerFactory.getLogger(CustomZuulFilter.class);

    /*
    * filterType：返回一个字符串代表过滤器的类型，在zuul中定义了四种不同生命周期的过滤器类型，具体如下：
    *    pre：路由之前
    *    routing：路由之时
    *    post： 路由之后
    *    error：发送错误调用
    * */
    @Override
    public String filterType() {
        return "pre";
    }

    /*
    * filterOrder：过滤的顺序
    * */
    @Override
    public int filterOrder() {
        return 0;
    }

    /*
    * shouldFilter：这里可以写逻辑判断，是否要过滤，本文true,永远过滤
    * */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /*
    * run：过滤器的具体逻辑
    * */
    @Override
    public Object run() throws ZuulException {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        logger.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
        String accessToken = request.getParameter("token");
        if (accessToken == null) {
            logger.warn("accessToken is empty");
            currentContext.setSendZuulResponse(false);
            currentContext.setResponseStatusCode(401);
            try {
                currentContext.getResponse().getWriter().write("token is empty,authenticate failed");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
        logger.info("authenticate successfully");
        return null;
    }
}
