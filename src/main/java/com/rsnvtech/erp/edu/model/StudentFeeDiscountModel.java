package com.rsnvtech.erp.edu.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class StudentFeeDiscountModel {
    private Long  id;
    private Long studentId;
    private Long feeHeadId;
    private String discountType;
    private Double discountAmount;
    private LocalDateTime createDate;
    private LocalDateTime  modifiedDate;
}
