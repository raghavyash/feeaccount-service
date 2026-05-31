package com.rsnvtech.erp.edu.repository;

import com.rsnvtech.erp.edu.entity.FeeHeadEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeeHeadRepository extends JpaRepository<FeeHeadEntity,Long> {
}
