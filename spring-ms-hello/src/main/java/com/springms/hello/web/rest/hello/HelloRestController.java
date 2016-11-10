package com.springms.hello.web.rest.hello;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springms.hello.domain.hello.HelloBean;
import com.springms.hello.repository.hello.HelloRepository;

@RestController
public class HelloRestController {

	@Autowired
	private HelloRepository helloRepository;

	@GetMapping("/ping/{name}")
	public @ResponseBody HelloBean ping(@PathVariable("name") String name) {
		return new HelloBean(name, ThreadLocalRandom.current().nextInt());
	}

	@GetMapping("/list")
	public List<HelloBean> list() {
		List<HelloBean> list = new ArrayList<>();
		helloRepository.findAll().iterator().forEachRemaining(list::add);

		return list;
	}

}
