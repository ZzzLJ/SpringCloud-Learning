    ├─main
       ├─java
       │  └─com
       │      └─springcloud
       │          └─serverribbon
       │              │  ServerRibbonApplication.java
       │              │
       │              ├─config
       │              │      CustomLoadBalancerRule.java        自定义负载均衡策略
       │              │
       │              ├─controller
       │              │      RibbonController.java        @LoadBalanced：开启负载均衡
       │              │
       │              └─service
       │                  └─impl
       │                          RibbonServiceImpl.java        ribbon使用断路器
       │
       └─resources
           │  application.yml