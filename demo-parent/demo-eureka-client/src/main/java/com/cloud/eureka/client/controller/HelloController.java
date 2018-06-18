package com.cloud.eureka.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Value("${server.port}")
	String port;
	
	@RequestMapping("/helloword/{name}")
    public String home(@PathVariable String name) {
        return "hi "+name+",i am from port:" +port;
    }
}
