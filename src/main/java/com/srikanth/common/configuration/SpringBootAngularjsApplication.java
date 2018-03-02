package com.srikanth.common.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.srikanth")
public class SpringBootAngularjsApplication {
	
	public static void main(String[] args) 
	{
		SpringApplication.run(SpringBootAngularjsApplication.class, args);   
	}

}
