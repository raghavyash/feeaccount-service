package com.rsnvtech.erp.edu.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TransactionInvoiceLineModel {
    private Long  id;
    private Long studentId;
    private LocalDateTime invoiceDate;
    private LocalDateTime dueDate;
    private Long transactionInvoiceId;
    private Long feeHeadId;
    private Double amount;
    private Double concession_applied;
    private LocalDateTime createDate;
    private LocalDateTime  modifiedDate;
}
