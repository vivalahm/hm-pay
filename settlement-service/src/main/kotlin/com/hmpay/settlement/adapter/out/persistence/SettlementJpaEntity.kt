package com.hmpay.settlement.adapter.out.persistence

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "settlement")
class SettlementJpaEntity(
    @Id
    @GeneratedValue
    var rechargeMoneyId: Long? = null,
)
