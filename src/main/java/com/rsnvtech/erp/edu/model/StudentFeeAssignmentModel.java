package com.rsnvtech.erp.edu.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class StudentFeeAssignmentModel {
    private Long  id;
    private Long studentId;
    private Long feeStructureId;
    private LocalDateTime dueDate;
    private Double assignAmount;
    private LocalDateTime createDate;
    private LocalDateTime  modifiedDate;
}
