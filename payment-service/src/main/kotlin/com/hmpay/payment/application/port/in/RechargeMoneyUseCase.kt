package com.hmpay.payment.application.port.`in`

interface RechargeMoneyUseCase {
    fun rechargeMoney(command: RechargeMoneyCommand)
}
