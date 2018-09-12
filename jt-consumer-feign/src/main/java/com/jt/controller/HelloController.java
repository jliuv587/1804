package com.jt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jt.feign.EurekaFeign;

@RestController
public class HelloController {
	@Autowired
	private EurekaFeign eurekaFeign;
	@GetMapping("/hello/{name}")
	public String hello(@PathVariable String name){
		return eurekaFeign.hello(name);
	}
       
}
