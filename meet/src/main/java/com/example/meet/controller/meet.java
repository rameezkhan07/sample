package com.example.meet.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class meet {
	@RequestMapping("/display")
	public String Display() {
		return "i am rameez";
		
	}
	

}
