package org.my.project.repository;

import org.my.project.domain.user.BaseAuthority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BaseAuthorityRepository extends
		JpaRepository<BaseAuthority, Long>,
		JpaSpecificationExecutor<BaseAuthority> {

}
