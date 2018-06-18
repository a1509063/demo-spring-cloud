package com.cloud.eureka.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloWorldService {
	
	@Autowired
    RestTemplate restTemplate;
	
	public String helloService(String name) {
        return restTemplate.getForObject("http://SERVICE-CLIENT/helloword/"+name,String.class);
	}
}
