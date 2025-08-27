package com.hmpay.payment.adapter.out.persistence

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "payment")
class PaymentJpaEntity(
    @Id
    @GeneratedValue
    var rechargeMoneyId: Long? = null,
)
