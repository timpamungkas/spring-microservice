package com.springms.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springms.employee.repository.ContactUsRepository;

@Service
public class ContactUsService {

	@Autowired
	private ContactUsRepository contactUsRepository;
	
	public long count() {
		return contactUsRepository.count();
	}
	
}
