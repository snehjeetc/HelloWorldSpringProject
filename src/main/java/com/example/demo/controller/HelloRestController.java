package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRestController {
	
	//curl localhost:8080/hello -w "\n"
	@RequestMapping(value = {"", "/", "/home"})
	public String sayHello(){
		return "Hello From Bridgelabz!";
	}
	
	@RequestMapping(value = {"/query"}, method = RequestMethod.GET)
	public String sayHello(@RequestParam(value = "name") String name) {
		return "Hello " + name;
	}
	
	@GetMapping("/param/{name}")
	public String helloTo(@PathVariable String name) {
		return "Hello " + name + " From Bridgelabz"; 
	}
}
