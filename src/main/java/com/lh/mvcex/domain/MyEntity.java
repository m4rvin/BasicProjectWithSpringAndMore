package com.lh.mvcex.domain;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Configurable;

@Entity
@Configurable
public class MyEntity extends IdentifiableEntity {

	private String name;

	protected String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyEntity() {
	};

	public MyEntity(String name) {
		this.name = name;
	}
}
