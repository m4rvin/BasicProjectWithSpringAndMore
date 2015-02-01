package com.lh.mvcex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lh.mvcex.domain.MyEntity;
import com.lh.mvcex.repository.MyEntityRepository;

@Service
public class LogicController {
	@Autowired
	private MyEntityRepository myEntityRepository;

	public MyEntity saveEntity(String name) {
		MyEntity cg = new MyEntity(name);
		
		return myEntityRepository.save(cg);
	}
}
