package com.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.myapp")
public class MyappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyappApplication.class, args);
	}

}
