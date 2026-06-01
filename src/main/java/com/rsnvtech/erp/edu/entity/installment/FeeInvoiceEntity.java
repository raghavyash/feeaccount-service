package com.rsnvtech.erp.edu.entity.installment;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "fee_invoice")
public class FeeInvoiceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long  id;

    @Column(name = "STUDENT_ID")
    private Long studentId;

    @Column(name = "INVOICE_NUMBER")
    private String invoiceNumber;

    @Column(name = "INVOICE_DATE")
    private LocalDateTime invoiceDate;

    @Column(name = "PAYMENT_MODE")
    private String paymentMode;


    @Column(name = "DUE_DATE")
    private LocalDateTime dueDate;


    @Column(name = "TOTAL_AMOUNT")
    private Double totalAmount;

    @Column(name = "FINE_AMOUNT")
    private Double fineAmount;

    @Column(name = "DISCOUNT_AMOUNT")
    private Double discountAmount;

    @Column(name = "NET_AMOUNT")
    private Double netAmount;

    @Column(name = "STATUS")
    private String status;//(ENUM: Unpaid, Partial, Paid)

    @Column(name = "CREATE_DATE")
    private LocalDateTime createDate;

    @Column(name = "MODIFIED_DATE")
    private LocalDateTime  modifiedDate;
}
