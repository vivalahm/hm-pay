package com.hmpay.payment.adapter.out.persistence

import com.hmpay.payment.domain.MemberMoney
import org.springframework.stereotype.Component

@Component
class PaymentMapper {
    fun mapToDomainEntity(paymentJpaEntity: PaymentJpaEntity): MemberMoney {
        println(paymentJpaEntity.toString())
        return MemberMoney.generateMemberMoney(
            MemberMoney.MemberMoneyId((paymentJpaEntity.rechargeMoneyId ?: 0L).toString())
        )
    }
}
