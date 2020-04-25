package com.cloud.config.configclientsample.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class ClientControllerSample {

	@Value("${client.test.message: Default Message}")
	private String message;
	
	@Value("${client.test.message}")
	private String message2;

	@GetMapping("/message")
	public String getMessage() {
		return message+"-"+message2;
	}
	
	@GetMapping("/message2")
	public String getMessage2() {
		return  "-";
	}
}
