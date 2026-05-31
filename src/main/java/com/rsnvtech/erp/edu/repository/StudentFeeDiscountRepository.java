package com.rsnvtech.erp.edu.repository;

import com.rsnvtech.erp.edu.entity.StudentFeeDiscountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentFeeDiscountRepository extends JpaRepository<StudentFeeDiscountEntity,Long> {
}
