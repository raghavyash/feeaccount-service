package com.rsnvtech.erp.edu.entity.simple;

import com.rsnvtech.erp.edu.entity.FeeHeadEntity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "fee_structure_detail_master")
public class FeeStructureDetailEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long  id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FEE_HEAD_ID")
    private FeeHeadEntity feeHeadEntity;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "FEE_STRUCTURE_ID")
    private FeeStructureEntity feeStructure;

    @Column(name = "AMOUNT")
    private Double amount;
}
