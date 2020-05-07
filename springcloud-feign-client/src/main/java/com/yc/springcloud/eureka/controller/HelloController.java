package com.yc.springcloud.eureka.controller;

import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class HelloController {
	@Value("${server.port}")
	private int port;
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello client : " + port;
	}
	
	@RequestMapping("/info")
	public void intfo(HttpServletResponse response) {
		try {
			response.sendRedirect("/index.html");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
