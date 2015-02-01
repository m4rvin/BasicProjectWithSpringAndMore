package com.lh.mvcex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lh.mvcex.controller.LogicController;
import com.lh.mvcex.domain.MyEntity;

@RestController
@RequestMapping("/service")
public class Service {

	@Autowired
	private LogicController controller;

	@RequestMapping(value = "/public/{name}", method = RequestMethod.GET)
	public MyEntity storeEntityPublic(@PathVariable String name) {
		System.out.println("Hello " + name
				+ ", I am saving on the db. (PUBLIC)");
		MyEntity saved = controller.saveEntity(name);

		return saved;
	}
}