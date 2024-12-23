package com.rakib.paymentservice.repository;

import com.rakib.paymentservice.entity.TransactionDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionDetailsRepository extends JpaRepository<TransactionDetails, Long> {
}
