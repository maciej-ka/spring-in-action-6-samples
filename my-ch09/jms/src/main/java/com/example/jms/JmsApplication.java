package com.example.jms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@SpringBootApplication
public class JmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JmsApplication.class, args);
	}

}

@RestController
@RequestMapping(path = "/api/orders", produces = "application/json")
@CrossOrigin(origins = "http://localhost:8080")
class OrderApiController {
	@PostMapping(consumes = "application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public String postMethodName(@RequestBody String entity) {
		return "hello";
	}
	
}
