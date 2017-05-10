package com.shop.runner;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ShopRunnerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopRunnerApplication.class, args);
	}
	
	@GetMapping("/hello")
	String get()
	{
		return "Hello World!! The time is now: " + new Date();
	}
}
