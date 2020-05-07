package com.yc.springcloud.eureka.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yc.springcloud.eureka.remote.RemoteClient;

@RestController
public class HelloController {
	@Autowired
	private RemoteClient remoteClient;
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@RequestMapping("/hello")
	public String getInfo() {
		System.out.println("当前eureka中注册的所有服务器如下：");
		List<String> list = discoveryClient.getServices();
		for (String str : list) {
			System.out.println("服务器：" + str);
		}
		return remoteClient.getHello();
	}
}
