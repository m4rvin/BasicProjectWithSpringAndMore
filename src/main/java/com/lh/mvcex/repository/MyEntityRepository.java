package com.lh.mvcex.repository;

import com.lh.mvcex.domain.MyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface MyEntityRepository extends JpaSpecificationExecutor<MyEntity>,
		JpaRepository<MyEntity, Long> {

}
