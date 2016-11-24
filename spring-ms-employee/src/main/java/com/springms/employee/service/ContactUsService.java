package com.springms.employee.service;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springms.employee.repository.ContactUsRepository;

@Service
public class ContactUsService {

	@Autowired
	private ContactUsRepository contactUsRepository;
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public long count() {
		System.out.println(sessionFactory);
		
		return contactUsRepository.count();
	}
	
}
