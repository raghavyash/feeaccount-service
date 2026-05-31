package com.rsnvtech.erp.edu.controller;

import com.rsnvtech.erp.edu.model.FeeHeadModel;
import com.rsnvtech.erp.edu.services.FeeHeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/master/fee/head")
public class FeeHeadController {
    @Autowired
    private FeeHeadService feeHeadService;

    @PostMapping({"/save"})
    public ResponseEntity<String> saveCategory(@RequestBody FeeHeadModel model) {
        Boolean result = true;
        if (result)
            return new ResponseEntity("Successfully Save", HttpStatus.OK);
        else
            return new ResponseEntity("Not save Successfully", HttpStatus.BAD_REQUEST);
    }


}
