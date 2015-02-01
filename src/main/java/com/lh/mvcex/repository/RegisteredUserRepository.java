package com.lh.mvcex.repository;

import com.lh.mvcex.domain.user.RegisteredUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RegisteredUserRepository extends
		JpaRepository<RegisteredUser, Long>,
		JpaSpecificationExecutor<RegisteredUser> {

	public RegisteredUser findByUsername(String username);
}
