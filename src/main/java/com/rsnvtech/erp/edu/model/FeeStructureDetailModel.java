package com.rsnvtech.erp.edu.model;

import lombok.Data;

@Data
public class FeeStructureDetailModel {
    private Long  id;
    private Long feeHeadId;
    private Long feeStructureId;
    private Double amount;
}
