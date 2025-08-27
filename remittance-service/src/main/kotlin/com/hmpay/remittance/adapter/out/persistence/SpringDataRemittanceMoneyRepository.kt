package com.hmpay.remittance.adapter.out.persistence

import org.springframework.data.jpa.repository.JpaRepository

interface SpringDataRemittanceMoneyRepository : JpaRepository<RemittanceMoneyJpaEntity, Long>
