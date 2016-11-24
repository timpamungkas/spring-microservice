package com.springms.employee.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springms.employee.service.ContactUsService;

@RestController
public class ContactUsController {

	@Autowired
	private ContactUsService contactUsService;
	
	@GetMapping("/test")
	public String test() {
		return "Hello employee: " + contactUsService.count() + ", " + contactUsService.findSome();
	}
	
}
