package com.hmpay.settlement.adapter.out.persistence

import org.springframework.data.jpa.repository.JpaRepository

interface SpringDataSettlementRepository : JpaRepository<SettlementJpaEntity, Long>
