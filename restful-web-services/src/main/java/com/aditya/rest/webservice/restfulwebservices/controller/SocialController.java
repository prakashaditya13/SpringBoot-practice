package com.aditya.rest.webservice.restfulwebservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SocialController {

	@GetMapping(path = "/hello/{name}")
	public String helloworld(@PathVariable String name) {
		return "This is "+name;
	}
}
