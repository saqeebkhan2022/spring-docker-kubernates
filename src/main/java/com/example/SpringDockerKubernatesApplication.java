package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDockerKubernatesApplication {

	@GetMapping("/")
	public String home(){
		return "Docker kubernates deployed";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDockerKubernatesApplication.class, args);
	}

}
