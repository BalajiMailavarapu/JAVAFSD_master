package com.example.May2026.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class May2026Application {

	public static void main(String[] args) {
		SpringApplication.run(May2026Application.class, args);
	}

}

@RestController
class hellocontroller
{
	@GetMapping("/hello")
	public String hello()
	{
		return "Hello Springboot";
	}
	
	@PostMapping("/create")
	public String createapp()
	{
		return "Data created successfully";
	}
	
	@PutMapping("/update")
	public String updateapp()
	{
		return "Data update successfully";
	}
	
	@DeleteMapping("/delete")
	public String deleteapp()
	{
		return "Data deleted successfully";
	}
}