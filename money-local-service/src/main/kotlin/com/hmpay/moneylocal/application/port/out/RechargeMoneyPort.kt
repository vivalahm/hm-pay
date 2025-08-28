package com.hmpay.moneylocal.application.port.out

import com.hmpay.moneylocal.domain.MemberMoney

interface RechargeMoneyPort {
    fun rechargeMoney(memberMoneyId: MemberMoney.MemberMoneyId)
}
