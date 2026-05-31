package com.rsnvtech.erp.edu.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TransactionInvoiceModel {
    private Long  id;
    private Long studentId;
    private LocalDateTime invoiceDate;
    private LocalDateTime dueDate;
    private Double totalAmount;
    private String status;//(ENUM: Unpaid, Partial, Paid)
    private LocalDateTime createDate;
    private LocalDateTime  modifiedDate;
}
