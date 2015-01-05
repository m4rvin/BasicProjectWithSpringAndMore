package org.my.project.repository;

import org.my.project.domain.MyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface EntityRepository extends JpaSpecificationExecutor<MyEntity>,
		JpaRepository<MyEntity, Long> {

}
