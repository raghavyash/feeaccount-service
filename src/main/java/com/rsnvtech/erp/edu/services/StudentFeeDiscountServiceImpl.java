package com.rsnvtech.erp.edu.services;

import com.rsnvtech.erp.edu.entity.simple.FeeReceiptEntity;
import com.rsnvtech.erp.edu.model.StudentFeeDiscountModel;
import com.rsnvtech.erp.edu.repository.StudentFeeDiscountRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentFeeDiscountServiceImpl implements StudentFeeDiscountService{

    @Autowired
    private StudentFeeDiscountRepository studentFeeDiscountRepository;

    @Override
    public boolean saveStudentFeeDiscount(StudentFeeDiscountModel model) {
        return true;
    }
}
