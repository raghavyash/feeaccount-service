package com.rsnvtech.erp.edu.services;

import com.rsnvtech.erp.edu.entity.simple.FeeStructureEntity;
import com.rsnvtech.erp.edu.model.FeeStructureModel;
import com.rsnvtech.erp.edu.repository.FeeStructureRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeeStructureServiceImpl implements FeeStructureService{
    @Autowired
    private FeeStructureRepository feeStructureRepository;


    @Override
    public boolean saveFeeStructure(FeeStructureModel model) {
        FeeStructureEntity entity= new FeeStructureEntity();
        BeanUtils.copyProperties(entity,model);
        feeStructureRepository.save(entity);
        return true;
    }
}
