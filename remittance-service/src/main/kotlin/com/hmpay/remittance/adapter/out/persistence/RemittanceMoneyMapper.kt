package com.hmpay.remittance.adapter.out.persistence

import com.hmpay.remittance.domain.RemittanceMoney
import org.springframework.stereotype.Component

@Component
class RemittanceMoneyMapper {
    fun mapToDomainEntity(remittanceMoneyJpaEntity: RemittanceMoneyJpaEntity): RemittanceMoney {
        println(remittanceMoneyJpaEntity.toString())
        return RemittanceMoney.generateRemittanceMoney(
            RemittanceMoney.RemittanceMoneyId((remittanceMoneyJpaEntity.remittanceMoneyId ?: 0L).toString())
        )
    }
}
