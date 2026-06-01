package com.rsnvtech.erp.edu.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class FeeStructureModel {
    private Long  id;
    private Long academicYearId;
    private Long classId;
    private Long FeeHeadId;
    private String status;
    private LocalDateTime dueDate;
    private LocalDateTime createDate;
    private LocalDateTime  modifiedDate;
    private List<FeeStructureDetailModel> feeStructureDetails;
}
