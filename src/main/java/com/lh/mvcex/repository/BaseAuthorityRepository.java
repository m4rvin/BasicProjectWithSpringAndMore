package com.lh.mvcex.repository;

import com.lh.mvcex.domain.user.BaseAuthority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseAuthorityRepository extends
		JpaRepository<BaseAuthority, Long>,
		JpaSpecificationExecutor<BaseAuthority> {

}
