package com.rsnvtech.erp.edu.entity.installment;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@Entity
@Table(name = "fee_installment")
public class FeeInstallmentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long  id;

    @Column(name = "CLASS_ID")
    private Long classId;

    @Column(name = "ACADEMIC_YEAR_ID")
    private Long academicYearId;


    @Column(name = "DUE_DATE")
    private LocalDateTime dueDate;

    @Column(name = "INSTALLMENT_AMOUNT")
    private Double installmentAmount;

    @Column(name = "INSTALLMENT_NUMBER")
    private String installmentNumber;

    @Column(name = "STATUS")
    private String status; //

    @Column(name = "CREATE_DATE")
    private LocalDateTime createDate;

    @Column(name = "MODIFIED_DATE")
    private LocalDateTime  modifiedDate;
}
/*  Status
PENDING
        PARTIAL
PAID
        OVERDUE*/
