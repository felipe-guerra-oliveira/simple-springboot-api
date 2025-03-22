package br.com.impacta.api.simple_springboot_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SimpleSpringbootApiApplication {

	
	@RequestMapping(
			method = RequestMethod.GET, 
			path = "/ping", 
			name = "Health Check", 
			produces = MediaType.APPLICATION_JSON_VALUE 
	)
	public String ping() {
		return "OK";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(SimpleSpringbootApiApplication.class, args);
	}

}
