## 微服务（spring cloud实现基于spring boot）
### support
#### 微服务支持
* config-server  

    > 分布式配置服务（各应用的所有环境提供了一个中心化的外部配置。它实现了对服务端和客户端对Spring Environment和PropertySource抽象的映射，所以它除了适用于Spring构建的应用程序，也可以在任何其他语言运行的应用程序中使用。作为一个应用可以通过部署管道来进行测试或者投入生产，我们可以分别为这些环境创建配置，并且在需要迁移环境的时候获取对应环境的配置来运行）  
    ![输入图片说明](http://git.oschina.net/uploads/images/2017/0119/170644_c07b7897_489925.png "在这里输入图片标题")
    ![输入图片说明](http://git.oschina.net/uploads/images/2017/0114/013548_42cfa443_489925.jpeg "配置服务器")
    
* discovery-server  

    > 服务注册与发现，netflix eureka实现  
    ![输入图片说明](http://git.oschina.net/uploads/images/2017/0114/013731_aaaad60d_489925.jpeg "在这里输入图片标题")
* api-gateway  

    > api网关，netflix zuul实现（为客户端调用服务提供统一入口）  
    ![输入图片说明](http://git.oschina.net/uploads/images/2017/0114/013806_2ed9c7ed_489925.jpeg "在这里输入图片标题")  
    
* hystrix-dashboard
    > 应用监控  
    
* monitor-server
    > 应用健康信息（spring boot admin）  
* sleuth-stream-server
    > 服务跟踪  
    
### service  

#### 服务示例  
   > 这一模块有两个服务示例，服务中使用了
   >     eureka feign（Http 客户端）
   >         此客户端可以让http调用更加方便，默认使用了eureka ribbon客户端负载均衡 
   >     eureka hystrix（断路器）
   >         在微服务架构中，通常会涉及到多个服务的调用，断路器的引入，在部分非必要服务不可用的情况下，
   >        客户能够得到正常响应。            
   ![输入图片说明](http://git.oschina.net/uploads/images/2017/0119/172825_2db1a02e_489925.jpeg "在这里输入图片标题")
            
   ![输入图片说明](http://git.oschina.net/uploads/images/2017/0119/172505_5b413b99_489925.jpeg "在这里输入图片标题")
            
#### 启动顺序
1. 启动config-server  

    > 先启动配置服务
2. 启动discovery-server  

    > 再启动服务注册与发现服务

3. 其他服务没有顺序