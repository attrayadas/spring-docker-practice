package com.attraya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDockerPracticeApplication {

	@GetMapping("/greet")
	public String greeting(){
		return "Welcome to Spring Boot Application using Docker! Your application is running. Pushing to Docker Hub :)";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDockerPracticeApplication.class, args);
	}

}
