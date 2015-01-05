package org.my.project.controller;

import org.my.project.domain.MyEntity;
import org.my.project.repository.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Controller {
	@Autowired
	private EntityRepository entityRepository;

	public void saveEntity(String name) {
		MyEntity cg = new MyEntity(name);
		
		entityRepository.save(cg);
	}
	
	
}
