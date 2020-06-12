package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@GetMapping("health")
	public String health(){
		return "Running Successfully 1111";
	}

}
