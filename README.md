## 微服务（spring cloud实现基于spring boot）
### support
#### 微服务支持
* config-server  

    > 分布式配置服务  
    ![输入图片说明](http://git.oschina.net/uploads/images/2017/0119/170644_c07b7897_489925.png "在这里输入图片标题")
    ![输入图片说明](http://git.oschina.net/uploads/images/2017/0114/013548_42cfa443_489925.jpeg "配置服务器")
    
* discovery-server  

    > 服务注册与发现，netflix eureka实现  
    ![输入图片说明](http://git.oschina.net/uploads/images/2017/0114/013731_aaaad60d_489925.jpeg "在这里输入图片标题")
* api-gateway  

    > api网关，netflix zuul实现  
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
   ![输入图片说明](http://git.oschina.net/uploads/images/2017/0119/172449_b7a0238c_489925.jpeg "在这里输入图片标题")  
            
   ![输入图片说明](http://git.oschina.net/uploads/images/2017/0119/172505_5b413b99_489925.jpeg "在这里输入图片标题")
            
#### 启动顺序
1. 启动config-server  

    > 先启动配置服务
2. 启动discovery-server  

    > 再启动服务注册与发现服务

3. 其他服务没有顺序