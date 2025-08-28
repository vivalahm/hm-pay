package com.hmpay.moneylocal.adapter.out.persistence

import com.hmpay.moneylocal.domain.MemberMoney
import org.springframework.stereotype.Component

@Component
class LocalMoneyMapper {
    fun mapToDomainEntity(localMoneyJpaEntity: LocalMoneyJpaEntity): MemberMoney {
        println(localMoneyJpaEntity.toString())
        return MemberMoney.generateMemberMoney(
            MemberMoney.MemberMoneyId((localMoneyJpaEntity.localMoneyId ?: 0L).toString())
        )
    }
}
