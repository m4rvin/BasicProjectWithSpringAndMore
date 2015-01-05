package org.my.project.repository;

import org.my.project.domain.user.RegisteredUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RegisteredUserRepository extends
		JpaRepository<RegisteredUser, Long>,
		JpaSpecificationExecutor<RegisteredUser> {

	public RegisteredUser findByUsername(String username);
}
