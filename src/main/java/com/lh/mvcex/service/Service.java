package com.lh.mvcex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lh.mvcex.controller.LogicController;

@RestController
@RequestMapping("/service")
public class Service {

	@Autowired
	private LogicController controller;

	@RequestMapping(value = "/public/{name}", method = RequestMethod.GET)
	public String storeEntityPublic(@PathVariable String name) {
		String result = "Hello " + name + ", I am saving on the db. (PUBLIC)";
		controller.saveEntity(name);

		return result;
	}

	@PreAuthorize("hasAnyRole('ROLE_USER','ROLE_ADMIN')")
	@RequestMapping(value = "/user/{name}", method = RequestMethod.GET)
	public String storeEntityUserOrAdmin(@PathVariable String name) {
		String result = "Hello " + name
				+ ", I am saving on the db. (USER OR ADMIN)";
		controller.saveEntity(name);

		return result;
	}

	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@RequestMapping(value = "/admin/{name}", method = RequestMethod.GET)
	public String storeEntityAdmin(@PathVariable String name) {
		String result = "Hello Admin " + name
				+ ", I am saving on the db. (ADMIN ONLY)";
		controller.saveEntity(name);

		return result;
	}
}