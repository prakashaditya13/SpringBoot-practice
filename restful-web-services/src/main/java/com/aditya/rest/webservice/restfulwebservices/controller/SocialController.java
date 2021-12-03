package com.aditya.rest.webservice.restfulwebservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SocialController {

	@GetMapping(path = "/hello")
	public String helloworld() {
		return "Hello World";
	}
}
