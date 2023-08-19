package com.example.demo.cntr;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class TestCntr {

	@RequestMapping(value = "welcome",method =RequestMethod.GET)
	public String getWelcome() {
		LocalDateTime date=LocalDateTime.now();
		return "Welcome to the Pipeline Spring Boot Project - "+date;
	}
	
	@RequestMapping(value = "obj",method = RequestMethod.POST)
	public String getObj(@RequestBody Object obj) {
		return obj.toString();
	}
	
	@RequestMapping(value = "pipeline",method = RequestMethod.GET)
	public String getPipeline() {
		LocalDate date=LocalDate.now();
		return "Welcome to the Pipeline Spring Boot Project - "+date+" "
				+ "- Great you have done proper deployement through jenkins";
	}
	
	@RequestMapping(value = "webhook",method =RequestMethod.GET)
	public String getWebhook() {
		LocalDateTime date=LocalDateTime.now();
		return "Welcome to the Pipeline Spring Boot Project - "+date+" Webhook added";
	}
}
