package com.hmpay.payment.application.service

import com.hmpay.common.UseCase
import com.hmpay.payment.application.port.`in`.RechargeMoneyCommand
import com.hmpay.payment.application.port.`in`.RechargeMoneyUseCase
import jakarta.transaction.Transactional

@UseCase
@Transactional
class RechargeMoney : RechargeMoneyUseCase {
    override fun rechargeMoney(command: RechargeMoneyCommand) {
        // TODO: implement recharge logic
    }
}
