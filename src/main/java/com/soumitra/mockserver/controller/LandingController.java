package com.soumitra.mockserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LandingController {
	
	@GetMapping("/")
	public String landingPage() {
		return "visit **swagger-ui.html page for api details";
	}

}
