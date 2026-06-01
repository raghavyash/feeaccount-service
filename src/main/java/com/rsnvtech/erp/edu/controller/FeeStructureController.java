package com.rsnvtech.erp.edu.controller;

import com.rsnvtech.erp.edu.model.FeeHeadModel;
import com.rsnvtech.erp.edu.model.FeeStructureModel;
import com.rsnvtech.erp.edu.services.FeeHeadService;
import com.rsnvtech.erp.edu.services.FeeStructureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/master/fee/structure")
public class FeeStructureController {

    @Autowired
    private FeeStructureService feeStructureService;

    @PostMapping({"/save"})
    public ResponseEntity<String> saveCategory(@RequestBody FeeStructureModel model) {
        Boolean result = feeStructureService.saveFeeStructure(model);
        if (result)
            return new ResponseEntity("Successfully Save", HttpStatus.OK);
        else
            return new ResponseEntity("Not save Successfully", HttpStatus.BAD_REQUEST);
    }
}
