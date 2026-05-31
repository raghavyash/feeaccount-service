package com.rsnvtech.erp.edu.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@Entity
@Table(name = "fee_head_master")
public class FeeHeadEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long  id;

    @Column(name = "FEE_HEAD_NAME")
    private String feeHeadName;

    @Column(name = "FEE_CODE")
    private String feeCode;

    @Column(name = "STATUS")
    private Boolean status;

    @Column(name = "IS_REFUNDABLE")
    private Boolean isRefundable;

    @Column(name = "GL_ACCOUNT_CODE")
    private String glAccountCode;

    @Column(name = "CREATE_DATE")
    private LocalDateTime createDate;

    @Column(name = "MODIFIED_DATE")
    private LocalDateTime  modifiedDate;
}
/*
Tuition Fee
Transport Fee
Hostel Fee
Examination Fee
Smart Class Fee*/
