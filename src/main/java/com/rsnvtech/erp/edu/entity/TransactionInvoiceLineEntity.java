package com.rsnvtech.erp.edu.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "transaction_invoice_line")
public class TransactionInvoiceLineEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TX_INVOICE_LINE_ID")
    private Long  txInvoiceLineId;

    @Column(name = "STUDENT_ID")
    private Long studentId;

    @Column(name = "INVOICE_DATE")
    private LocalDateTime invoiceDate;

    @Column(name = "DUE_DATE")
    private LocalDateTime dueDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TX_INVOICE_ID")
    private TransactionInvoiceEntity transactionInvoiceEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FEE_HEAD_ID")
    private FeeHeadEntity feeHeadEntity;

    @Column(name = "AMOUNT")
    private Double amount;

    @Column(name = "CONCESSION_APPLIED")
    private Double concession_applied;

    @Column(name = "CREATE_DATE")
    private LocalDateTime createDate;

    @Column(name = "MODIFIED_DATE")
    private LocalDateTime  modifiedDate;
}
