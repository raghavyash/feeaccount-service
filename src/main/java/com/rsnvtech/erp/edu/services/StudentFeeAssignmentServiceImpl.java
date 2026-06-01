package com.rsnvtech.erp.edu.services;

import com.rsnvtech.erp.edu.entity.simple.StudentFeeAssignmentEntity;
import com.rsnvtech.erp.edu.model.StudentFeeAssignmentModel;
import com.rsnvtech.erp.edu.repository.StudentFeeAssignmentRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentFeeAssignmentServiceImpl implements StudentFeeAssignmentService{

    @Autowired
    private StudentFeeAssignmentRepository studentFeeAssignmentRepository;

    @Override
    public boolean saveStudentFeeAssignment(StudentFeeAssignmentModel model) {
        StudentFeeAssignmentEntity entity= new StudentFeeAssignmentEntity();
        BeanUtils.copyProperties(entity,model);
        studentFeeAssignmentRepository.save(entity);
        return true;
    }
}
