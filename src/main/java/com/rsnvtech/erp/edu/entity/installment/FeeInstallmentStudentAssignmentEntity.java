package com.rsnvtech.erp.edu.entity.installment;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@Entity
@Table(name = "fee_installment_student")
public class FeeInstallmentStudentAssignmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long  id;

    @Column(name = "STUDENT_ID")
    private Long studentId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FEE_INSTALLMENT_ID")
    private FeeInstallmentEntity feeInstallment;

    @Column(name = "DUE_DATE")
    private LocalDateTime dueDate;

    @Column(name = "ASSIGN_AMOUNT")
    private Double assignAmount;

    @Column(name = "CREATE_DATE")
    private LocalDateTime createDate;

    @Column(name = "MODIFIED_DATE")
    private LocalDateTime  modifiedDate;
}
