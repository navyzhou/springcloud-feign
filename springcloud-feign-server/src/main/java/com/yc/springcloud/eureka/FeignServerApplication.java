package com.yc.springcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients // 启用Feign的客户端，即开启声明式服务器调用
public class FeignServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(FeignServerApplication.class, args);
	}
}	
