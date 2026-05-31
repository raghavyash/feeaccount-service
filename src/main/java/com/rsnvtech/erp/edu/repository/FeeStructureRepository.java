package com.rsnvtech.erp.edu.repository;

import com.rsnvtech.erp.edu.entity.FeeStructureEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeeStructureRepository extends JpaRepository<FeeStructureEntity,Long> {
}
