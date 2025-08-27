package com.hmpay.remittance.adapter.out.persistence

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "remittance_money")
class RemittanceMoneyJpaEntity(
    @Id
    @GeneratedValue
    var remittanceMoneyId: Long? = null,
)
