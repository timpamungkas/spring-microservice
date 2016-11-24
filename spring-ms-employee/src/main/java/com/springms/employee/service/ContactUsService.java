package com.springms.employee.service;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springms.employee.domain.Message;
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

	@SuppressWarnings("unchecked")
	public long findSome() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Message.class);

		try {
			List<Message> list = criteria.list();

			return list.size();
		} finally {
			session.close();
		}
	}

}
