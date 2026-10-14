package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    System.out.println("Start application");
    System.out.println("Start application 3");
    System.out.println(new Date());
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
