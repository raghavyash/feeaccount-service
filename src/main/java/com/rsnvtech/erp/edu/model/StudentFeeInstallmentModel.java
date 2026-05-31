package com.rsnvtech.erp.edu.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class StudentFeeInstallmentModel {
    private Long  id;
    private Long studentId;
    private Long academicYearId;
    private Long feeHeadId;
    private LocalDateTime dueDate;
    private Double installmentAmount;
    private Integer installmentNumber;
    private String status;
    private LocalDateTime createDate;
    private LocalDateTime  modifiedDate;
}
