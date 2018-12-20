    ├─main
    │  ├─java
    │  │  └─com
    │  │      └─springcloud
    │  │          └─configserver
    │  │                  ConfigServerApplication.java      @EnableConfigServer     开启配置服务器功能
    │  │
    │  └─resources
    │      │  application.yml       分布式配置中心组件
    │
    └─test
        └─java
            └─com
                └─springcloud
                    └─configserver
                            ConfigServerApplicationTests.java

http://localhost:8888/{application}-{profile}.properties获取远程git配置
http请求地址和资源文件映射如下:  
/{application}/{profile}[/{label}]  
/{application}-{profile}.yml    
/{label}/{application}-{profile}.yml    
/{application}-{profile}.properties     
/{label}/{application}-{profile}.properties     