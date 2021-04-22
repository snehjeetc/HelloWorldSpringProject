package com.example.demo;

import com.example.demo.controller.HelloRestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HelloWorldApplication {
	
	public static final Logger logger = LoggerFactory.getLogger(HelloWorldApplication.class);
	public static void main(String[] args) {
		logger.debug("Welcome to spring concept demo");
		SpringApplication.run(HelloWorldApplication.class, args);
	}
}
