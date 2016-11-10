package com.springms.hello.injector;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

import com.springms.hello.domain.hello.HelloBean;
import com.springms.hello.repository.hello.HelloRepository;

@Controller
public class DummyDataInjector implements CommandLineRunner {

	@Autowired
	private HelloRepository helloRepository;

	@Override
	public void run(String... args) throws Exception {
		for (int i = 0; i < 10; i++) {
			HelloBean helloBean = new HelloBean("Hello Bean " + i, ThreadLocalRandom.current().nextInt(1000000));
			helloRepository.save(helloBean);
		}
	}

}
