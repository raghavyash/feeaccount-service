package com.rsnvtech.erp.edu.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "transaction_receipt")
public class TransactionReceiptEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TX_RECEIPT_ID")
    private Long  txReceiptId;

    @Column(name = "STUDENT_ID")
    private Long studentId;

    @Column(name = "PAYMENT_MODE")
    private String paymentMode;

    @Column(name = "TRANSACTION_DATE")
    private LocalDateTime transactionDate;


    @Column(name = "AMOUNT_PAID")
    private Double amountPaid;


    @Column(name = "CREATE_DATE")
    private LocalDateTime createDate;

    @Column(name = "MODIFIED_DATE")
    private LocalDateTime  modifiedDate;
}
