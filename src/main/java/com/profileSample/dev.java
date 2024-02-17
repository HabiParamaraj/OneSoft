package com.profileSample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class dev {
	@GetMapping("/getDevops")
	public String getDevops() {
		return "Devops";
		
	}

}
