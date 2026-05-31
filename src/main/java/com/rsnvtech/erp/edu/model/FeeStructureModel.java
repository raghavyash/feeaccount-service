package com.rsnvtech.erp.edu.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class FeeStructureModel {
    private Long  id;
    private Long academicYearId;
    private Long classId;
    private Long FeeHeadId;
    private Double amount;
    private LocalDateTime dueDate;
    private LocalDateTime createDate;
    private LocalDateTime  modifiedDate;
}
