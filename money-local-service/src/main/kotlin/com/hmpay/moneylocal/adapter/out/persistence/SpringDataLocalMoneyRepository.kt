package com.hmpay.moneylocal.adapter.out.persistence

import org.springframework.data.jpa.repository.JpaRepository

interface SpringDataLocalMoneyRepository : JpaRepository<LocalMoneyJpaEntity, Long>
