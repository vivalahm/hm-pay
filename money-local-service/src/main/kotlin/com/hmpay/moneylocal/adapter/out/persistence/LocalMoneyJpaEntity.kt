package com.hmpay.moneylocal.adapter.out.persistence

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "local_money")
class LocalMoneyJpaEntity(
    @Id
    @GeneratedValue
    var localMoneyId: Long? = null,
)
