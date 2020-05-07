package com.yc.springcloud.eureka.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 声明一个接口，定义个方法获取一个整型值
 * 指定这个接口的数据来源是哪一个服务器，通过注解FeignClient来指定，常用的属性有：
 *  name：指定要访问的注册服务器的名称
 *  url: url一般用于调式
 *  Remote : 远程
 *  Feign : 伪装
 * 源辰信息
 * @author navy
 * @2019年8月8日
 */
// 指定我们的要调用的服务器是哪个，这里的name的值是注册到eureka server中的application.name的值
// 定义Feign的客户端
@FeignClient(name="client-service") 
public interface RemoteClient {
	@RequestMapping("/client/hello")
	public String getHello();
}
