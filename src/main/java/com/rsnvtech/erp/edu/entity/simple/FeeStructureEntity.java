package com.rsnvtech.erp.edu.entity.simple;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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

    @Column(name = "STATUS")
    private String status;

    @OneToMany(mappedBy = "feeStructure", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FeeStructureDetailEntity> feeStructureDetails = new ArrayList<>();

    @Column(name = "DUE_DATE")
    private LocalDateTime dueDate;

    @Column(name = "CREATE_DATE")
    private LocalDateTime createDate;

    @Column(name = "MODIFIED_DATE")
    private LocalDateTime  modifiedDate;
}
