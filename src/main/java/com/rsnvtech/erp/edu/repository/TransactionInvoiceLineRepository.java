package com.rsnvtech.erp.edu.repository;

import com.rsnvtech.erp.edu.entity.installment.FeeInstallmentDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionInvoiceLineRepository extends JpaRepository<FeeInstallmentDetailEntity.FeeTransactionInvoiceEntity,Long> {
}
