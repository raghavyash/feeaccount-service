package com.rsnvtech.erp.edu.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "transaction_invoice")
public class TransactionInvoiceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TX_INVOICE_ID")
    private Long  txInvoiceId;

    @Column(name = "STUDENT_ID")
    private Long studentId;

    @Column(name = "INVOICE_DATE")
    private LocalDateTime invoiceDate;

    @Column(name = "DUE_DATE")
    private LocalDateTime dueDate;


    @Column(name = "TOTAL_AMOUNT")
    private Double totalAmount;

    @Column(name = "STATUS")
    private String status;//(ENUM: Unpaid, Partial, Paid)

    @Column(name = "CREATE_DATE")
    private LocalDateTime createDate;

    @Column(name = "MODIFIED_DATE")
    private LocalDateTime  modifiedDate;
}
