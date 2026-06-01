package com.rsnvtech.erp.edu.entity.installment;

import com.rsnvtech.erp.edu.entity.FeeHeadEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "fee_installment_detail")
public class FeeInstallmentDetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long  id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FEE_HEAD_ID")
    private FeeHeadEntity feeHeadEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FEE_INSTALLMENT_ID")
    private FeeInstallmentEntity feeInstallments;

    @Column(name = "AMOUNT")
    private Double amount;

    @Data
    @Entity
    @Table(name = "fee_transaction_invoice")
    public static class FeeTransactionInvoiceEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "ID")
        private Long  id;

        @Column(name = "STUDENT_ID")
        private Long studentId;

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "FEE_INVOICE_ID")
        private FeeInvoiceEntity feeInvoiceEntity;

        @Column(name = "INVOICE_DATE")
        private LocalDateTime invoiceDate;

        @Column(name = "DUE_DATE")
        private LocalDateTime dueDate;

        @Column(name = "AMOUNT")
        private Double amount;

        @Column(name = "TRANSACTION_REFERENCE")
        private String transactionReference;

        @Column(name = "STATUS")
        private String status;

        @Column(name = "CREATE_DATE")
        private LocalDateTime createDate;

        @Column(name = "MODIFIED_DATE")
        private LocalDateTime  modifiedDate;
    }
}
