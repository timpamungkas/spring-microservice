package com.springms.hello.repository.hello;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springms.hello.domain.hello.HelloBean;

@Repository
public interface HelloRepository extends CrudRepository<HelloBean, Integer> {

}
