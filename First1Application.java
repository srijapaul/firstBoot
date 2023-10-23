package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class First1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(First1Application.class, args);
		
		dev d=context.getBean(dev.class);
		d.show();
	}

}
