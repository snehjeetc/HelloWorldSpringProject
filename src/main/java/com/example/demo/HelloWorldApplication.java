package com.example.demo;

import com.example.demo.component.DemoBean;
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
		ConfigurableApplicationContext context = SpringApplication.run(HelloWorldApplication.class, args);
		DemoBean demoBean = context.getBean(DemoBean.class);
		logger.debug("Demo Bean = " + demoBean.toString());
	
	}

}
