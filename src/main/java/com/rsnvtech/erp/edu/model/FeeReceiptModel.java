package com.rsnvtech.erp.edu.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class FeeReceiptModel {
    private Long  receiptId;
    private Long studentId;
    private String receiptNumber;//Unique Number
    private LocalDateTime receiptDate;
    private String paymentMode;
    private LocalDateTime transactionDate;
    private String transactionReference;
    private Double amountPaid;
    private LocalDateTime createDate;
    private LocalDateTime  modifiedDate;
}
