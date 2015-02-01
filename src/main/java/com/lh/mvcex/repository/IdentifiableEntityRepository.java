package com.lh.mvcex.repository;

import com.lh.mvcex.domain.IdentifiableEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface IdentifiableEntityRepository extends
		JpaRepository<IdentifiableEntity, Long>,
		JpaSpecificationExecutor<IdentifiableEntity> {
}
