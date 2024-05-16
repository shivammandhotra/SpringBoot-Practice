package com.mandhotra.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class DockerDemoControler {
	
	@GetMapping("testAPI")
	public String testMethod() {
		return "I am working fine";
	}

}
