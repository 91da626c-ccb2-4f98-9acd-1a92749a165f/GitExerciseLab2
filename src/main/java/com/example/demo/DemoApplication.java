package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
        System.out.println("Start application");
        System.out.println("Start application 3");
        System.out.println(new Date());
        System.out.println();

        SpringApplication.run(DemoApplication.class, args);
	}

}
