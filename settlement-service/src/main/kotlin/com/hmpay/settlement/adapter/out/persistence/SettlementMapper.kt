package com.hmpay.settlement.adapter.out.persistence

import com.hmpay.settlement.domain.MemberMoney
import org.springframework.stereotype.Component

@Component
class SettlementMapper {
    fun mapToDomainEntity(entity: SettlementJpaEntity): MemberMoney {
        println(entity.toString())
        return MemberMoney.generateMemberMoney(
            MemberMoney.MemberMoneyId((entity.rechargeMoneyId ?: 0L).toString())
        )
    }
}
