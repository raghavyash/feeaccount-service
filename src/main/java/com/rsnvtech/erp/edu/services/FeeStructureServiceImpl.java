package com.rsnvtech.erp.edu.services;

import com.rsnvtech.erp.edu.entity.FeeHeadEntity;
import com.rsnvtech.erp.edu.entity.simple.FeeStructureDetailEntity;
import com.rsnvtech.erp.edu.entity.simple.FeeStructureEntity;
import com.rsnvtech.erp.edu.model.FeeStructureDetailModel;
import com.rsnvtech.erp.edu.model.FeeStructureModel;
import com.rsnvtech.erp.edu.repository.FeeStructureRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FeeStructureServiceImpl implements FeeStructureService{
    @Autowired
    private FeeStructureRepository feeStructureRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public boolean saveFeeStructure(FeeStructureModel model) {

        FeeStructureEntity entity= new FeeStructureEntity();
        entity.setStatus("Active");
        entity.setClassId(model.getClassId());
        entity.setAcademicYearId(model.getAcademicYearId());

        entity.setFeeStructureDetails(model.getFeeStructureDetails().stream().map(this::covertToFeeStructureEntity).toList());
        feeStructureRepository.saveAndFlush(entity);
        return true;
    }
    private FeeStructureDetailEntity covertToFeeStructureEntity(FeeStructureDetailModel model) {

        FeeStructureDetailEntity entity3 = new FeeStructureDetailEntity();
        FeeHeadEntity feeHeadEntity= new FeeHeadEntity();
        feeHeadEntity.setId(model.getFeeHeadId());
        entity3.setFeeHeadEntity(feeHeadEntity);

        FeeStructureEntity feeStructureEntity= new FeeStructureEntity();
        feeStructureEntity.setId(model.getFeeStructureId());
        entity3.setFeeStructure(feeStructureEntity);
        entity3.setAmount(model.getAmount());

        return entity3;
    }


}
