package com.hmpay.moneylocal.adapter.out.persistence

import com.hmpay.common.PersistenceAdapter
import com.hmpay.moneylocal.application.port.out.RechargeMoneyPort
import com.hmpay.moneylocal.domain.MemberMoney

@PersistenceAdapter
class LocalMoneyPersistenceAdapter(
    private val localMoneyRepository: SpringDataLocalMoneyRepository,
    private val localMoneyMapper: LocalMoneyMapper,
) : RechargeMoneyPort {

    override fun rechargeMoney(memberMoneyId: MemberMoney.MemberMoneyId) {
        // TODO: implement local money persistence logic
    }
}
