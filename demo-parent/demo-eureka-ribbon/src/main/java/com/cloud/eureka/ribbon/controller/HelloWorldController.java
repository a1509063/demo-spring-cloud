package com.cloud.eureka.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.eureka.ribbon.service.HelloWorldService;

@RestController
public class HelloWorldController {
	@Autowired
	HelloWorldService helloService;

	@RequestMapping(value = "/hello/{name}")
	public String hi(@PathVariable String name) {
		return helloService.helloService(name);
	}
}
