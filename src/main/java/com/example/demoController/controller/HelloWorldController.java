
package com.example.demoController.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot! 18/02/2022";
	}
	
	@GetMapping("/index")
	public String index2() {
		return "Greetings from Spring Boot! INDEX";
	}
	
}
