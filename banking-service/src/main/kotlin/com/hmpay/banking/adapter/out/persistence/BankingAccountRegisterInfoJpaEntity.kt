package com.hmpay.banking.adapter.out.persistence

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "banking_account_register_info")
class BankingAccountRegisterInfoJpaEntity(
    @Id
    @GeneratedValue
    var registerInfoId: Long? = null,
)
