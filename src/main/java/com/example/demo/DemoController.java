package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/check")
public class DemoController {
	
	@GetMapping("/status")
	public ResponseEntity<String> getStatus()
	{
		return new ResponseEntity<String>("now services are up and running",HttpStatus.OK);
	}

}
