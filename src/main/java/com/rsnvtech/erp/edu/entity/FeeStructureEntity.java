package com.rsnvtech.erp.edu.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "fee_structure_master")
public class FeeStructureEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long  id;

    @Column(name = "ACADEMIC_YEAR_ID")
    private Long academicYearId;

    @Column(name = "CLASS_ID")
    private Long classId;

    @ManyToOne(fetch = FetchType.LAZY) // Many orders belong to one user
    @JoinColumn(name = "FEE_HEAD_ID") // Specifies the foreign key column in the 'orders' table
    private FeeHeadEntity feeHeadEntity;

    @Column(name = "AMOUNT")
    private Double amount;

    @Column(name = "DUE_DATE")
    private LocalDateTime dueDate;

    @Column(name = "CREATE_DATE")
    private LocalDateTime createDate;

    @Column(name = "MODIFIED_DATE")
    private LocalDateTime  modifiedDate;
}
