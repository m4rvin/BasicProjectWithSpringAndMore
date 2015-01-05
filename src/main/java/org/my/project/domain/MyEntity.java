package org.my.project.domain;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Configurable;

@Entity
@Configurable
public class MyEntity extends IdentifiableEntity {

	public MyEntity() {};
	public MyEntity(String name) {
		this.name = name;
	}

	@NotNull
	private String name;
}
