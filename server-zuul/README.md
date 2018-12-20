    ├─main
    │  ├─java
    │  │  └─com
    │  │      └─springcloud
    │  │          └─serverzuul
    │  │              │  ServerZuulApplication.java         @EnableZuulProxy 开启zuul功能
    │  │              │
    │  │              └─zuul
    │  │                      CustomZuulFilter.java         zuul服务过滤
    │  │
    │  └─resources
    │      │  application.yml           zuul动态路由配置
    │      │
    │      ├─static
    │      └─templates
    └─test
        └─java
            └─com
                └─springcloud
                    └─serverzuul
                            ServerZuulApplicationTests.java

*SpringCloud Zuul通过与SpringCloud Eureka进行整合，将自身注册为Eureka服务治理下的应用，同时从Eureka中获得了所有其他微服务的实例信息。外层调用都必须通过API网关，使得将维护服务实例的工作交给了服务治理框架自动完成。     
*在API网关服务上进行统一调用来对微服务接口做前置过滤，以实现对微服务接口的拦截和校验。