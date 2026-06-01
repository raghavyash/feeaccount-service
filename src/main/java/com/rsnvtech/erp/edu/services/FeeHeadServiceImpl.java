package com.rsnvtech.erp.edu.services;

import com.rsnvtech.erp.edu.entity.FeeHeadEntity;
import com.rsnvtech.erp.edu.model.FeeHeadModel;
import com.rsnvtech.erp.edu.repository.FeeHeadRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeeHeadServiceImpl implements FeeHeadService{

    @Autowired
    private FeeHeadRepository feeHeadRepository;

    @Override
    public boolean saveFeeHead(FeeHeadModel model) {
        FeeHeadEntity entity = new FeeHeadEntity();
        BeanUtils.copyProperties(entity,model);
        feeHeadRepository.save(entity);
        return true;
    }
}
