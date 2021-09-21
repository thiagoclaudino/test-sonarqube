package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	private String password = "x74Yk#%lzejeqgd@!@#"

	@GetMapping("/")
	public String index() {
		
		System.out.println(password);
		
		return "Greetings from Spring Boot!";
	}

}
