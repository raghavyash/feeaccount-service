package com.rsnvtech.erp.edu.entity.simple;

import com.rsnvtech.erp.edu.entity.FeeHeadEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@Entity
@Table(name = "student_fee_discount")
public class StudentFeeDiscountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long  id;

    @Column(name = "STUDENT_ID")
    private Long studentId;

    @Column(name = "FEE_HEAD_ID")
    private FeeHeadEntity feeHeadEntity;

    @Column(name = "DISCOUNT_TYPE")
    private String discountType;

    @Column(name = "DISCOUNT_AMOUNT")
    private Double discountAmount;

    @Column(name = "CREATE_DATE")
    private LocalDateTime createDate;

    @Column(name = "MODIFIED_DATE")
    private LocalDateTime  modifiedDate;
}
