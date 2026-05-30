package com.rsnvtech.erp.edu.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@Entity
@Table(name = "student_fee_installment")
public class StudentFeeInstallmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long  id;

    @Column(name = "STUDENT_ID")
    private Long studentId;

    @Column(name = "INVOICE_ID")
    private TransactionInvoiceEntity transactionInvoiceEntity;

    @Column(name = "DUE_DATE")
    private LocalDateTime dueDate;


    @Column(name = "INSTALLMENT_AMOUNT")
    private Double installmentAmount;

    @Column(name = "INSTALLMENT_NUMBER")
    private Integer installmentNumber;

    @Column(name = "CREATE_DATE")
    private LocalDateTime createDate;

    @Column(name = "MODIFIED_DATE")
    private LocalDateTime  modifiedDate;
}
