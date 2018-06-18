package com.cloud.eureka.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.eureka.feign.interfaces.SchedualServiceHello;

@RestController
public class HelloWorldController {
	@Autowired
	SchedualServiceHello schedualServiceHello;

	@RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
	public String sayHi(@PathVariable String name) {
		return schedualServiceHello.sayHelloFromCilentOne(name);
	}
}
