package com.rsnvtech.erp.edu.entity.simple;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@Entity
@Table(name = "student_fee_assignment")
public class StudentFeeAssignmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long  id;

    @Column(name = "STUDENT_ID")
    private Long studentId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FEE_STRUCTURE_ID")
    private FeeStructureEntity feeStructure;

    @Column(name = "DUE_DATE")
    private LocalDateTime dueDate;

    @Column(name = "ASSIGN_AMOUNT")
    private Double assignAmount;

    @Column(name = "CREATE_DATE")
    private LocalDateTime createDate;

    @Column(name = "MODIFIED_DATE")
    private LocalDateTime  modifiedDate;
}
