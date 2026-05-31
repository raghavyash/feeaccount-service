package com.rsnvtech.erp.edu.repository;

import com.rsnvtech.erp.edu.entity.StudentFeeAssignmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentFeeAssignmentRepository extends JpaRepository<StudentFeeAssignmentEntity,Long> {
}
