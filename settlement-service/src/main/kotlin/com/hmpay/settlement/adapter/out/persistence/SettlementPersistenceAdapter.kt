package com.hmpay.settlement.adapter.out.persistence

import com.hmpay.common.PersistenceAdapter
import com.hmpay.settlement.application.port.out.RechargeMoneyPort
import com.hmpay.settlement.domain.MemberMoney

@PersistenceAdapter
class SettlementPersistenceAdapter(
    private val settlementRepository: SpringDataSettlementRepository,
    private val settlementMapper: SettlementMapper,
) : RechargeMoneyPort {

    override fun rechargeMoney(memberMoneyId: MemberMoney.MemberMoneyId) {
        // TODO: implement settlement persistence logic
    }
}
