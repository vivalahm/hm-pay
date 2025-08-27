package com.hmpay.payment.adapter.out.persistence

import org.springframework.data.jpa.repository.JpaRepository

interface SpringDataPaymentRepository : JpaRepository<PaymentJpaEntity, Long>
