package com.hmpay.payment.application.port.out

import com.hmpay.payment.domain.MemberMoney

interface RechargeMoneyPort {
    fun rechargeMoney(memberMoneyId: MemberMoney.MemberMoneyId)
}
