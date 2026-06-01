package com.rsnvtech.erp.edu.entity.simple;

import com.rsnvtech.erp.edu.entity.FeeHeadEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "fee_receipt")
public class FeeReceiptEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long  id;

    @Column(name = "STUDENT_ID")
    private Long studentId;

    @Column(name = "RECEIPT_NUMBER")
    private String receiptNumber;//Unique Number

    @Column(name = "RECEIPT_DATE")
    private LocalDateTime receiptDate;

    @Column(name = "PAYMENT_MODE")
    private String paymentMode;

    @Column(name = "TRANSACTION_DATE")
    private LocalDateTime transactionDate;

    @Column(name = "TRANSACTION_REFERENCE")
    private String transactionReference;

    @Column(name = "AMOUNT_PAID")
    private Double amountPaid;


    @Column(name = "CREATE_DATE")
    private LocalDateTime createDate;

    @Column(name = "MODIFIED_DATE")
    private LocalDateTime  modifiedDate;
}
