package com.chadvest.hellohuman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HellohumanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellohumanApplication.class, args);
	}
	
	@RequestMapping("/")
	public String index(@RequestParam(required=false) String name, @RequestParam(required=false) String last_name) {
		if(name != null) {
			if(last_name == null) {
				return "Hello " + name;	
			}
			else if(last_name != null) {
				return "Hello " + name + " " + last_name;				
			}
		}
		return "Hello Human";		
		
	}

}
