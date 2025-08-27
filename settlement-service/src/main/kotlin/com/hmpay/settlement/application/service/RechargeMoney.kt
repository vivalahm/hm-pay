package com.hmpay.settlement.application.service

import com.hmpay.common.UseCase
import com.hmpay.settlement.application.port.`in`.RechargeMoneyCommand
import com.hmpay.settlement.application.port.`in`.RechargeMoneyUseCase
import jakarta.transaction.Transactional

@UseCase
@Transactional
class RechargeMoney : RechargeMoneyUseCase {
    override fun rechargeMoney(command: RechargeMoneyCommand) {
        // TODO: implement settlement recharge logic
    }
}
