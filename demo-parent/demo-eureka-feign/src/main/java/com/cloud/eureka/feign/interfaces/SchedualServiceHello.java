package com.cloud.eureka.feign.interfaces;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("service-client")
public interface SchedualServiceHello {

	@RequestMapping(value = "/helloword/{name}")
	String sayHelloFromCilentOne(@PathVariable(value="name") String name);
	
	
}
