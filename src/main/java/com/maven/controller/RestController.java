package com.maven.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@org.springframework.web.bind.annotation.RestController
@RequestMapping("/home")
public class RestController {

	@GetMapping
	public String helloWorld() {
		return "Hello World";
	}
}
