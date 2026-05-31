package com.rsnvtech.erp.edu.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class FeeHeadModel {

    private Long  id;
    private String feeHeadName;
    private String feeCode;
    private Boolean status;
    private Boolean isRefundable;
    private String glAccountCode;
    private LocalDateTime createDate;
    private LocalDateTime  modifiedDate;
}
