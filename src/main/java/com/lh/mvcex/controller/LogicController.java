package com.lh.mvcex.controller;

import com.lh.mvcex.domain.MyEntity;
import com.lh.mvcex.repository.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LogicController {
	@Autowired
	private EntityRepository entityRepository;

	public void saveEntity(String name) {
		MyEntity cg = new MyEntity(name);
		
		entityRepository.save(cg);
	}
	
	
}
