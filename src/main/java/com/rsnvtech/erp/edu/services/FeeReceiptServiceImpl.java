package com.rsnvtech.erp.edu.services;

import com.rsnvtech.erp.edu.entity.simple.FeeReceiptEntity;
import com.rsnvtech.erp.edu.model.FeeReceiptModel;
import com.rsnvtech.erp.edu.model.StudentModel;
import com.rsnvtech.erp.edu.repository.FeeReceiptRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FeeReceiptServiceImpl implements FeeReceiptService{

    private final String BASE_URL = "https://localhost:8092/v1/student";
    private final String RESOURCES_URL ="getStudentDetail";
    @Autowired
    private FeeReceiptRepository feeReceiptRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public boolean saveFeeReceipt(FeeReceiptModel model) {
        String url = BASE_URL + "/"+RESOURCES_URL+"/" + model.getStudentId();
        StudentModel model1=  restTemplate.getForObject(url, StudentModel.class);

        FeeReceiptEntity entity= new FeeReceiptEntity();
        BeanUtils.copyProperties(entity,model);
        feeReceiptRepository.save(entity);
        return true;
    }
}
