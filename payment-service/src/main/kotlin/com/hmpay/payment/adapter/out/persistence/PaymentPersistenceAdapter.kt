package com.hmpay.payment.adapter.out.persistence

import com.hmpay.common.PersistenceAdapter
import com.hmpay.payment.application.port.out.RechargeMoneyPort
import com.hmpay.payment.domain.MemberMoney

@PersistenceAdapter
class PaymentPersistenceAdapter(
    private val paymentRepository: SpringDataPaymentRepository,
    private val paymentMapper: PaymentMapper,
) : RechargeMoneyPort {

    override fun rechargeMoney(memberMoneyId: MemberMoney.MemberMoneyId) {
        // TODO: implement recharge logic
    }
}
