package com.hmpay.moneylocal.application.service

import com.hmpay.common.UseCase
import com.hmpay.moneylocal.application.port.`in`.RechargeMoneyCommand
import com.hmpay.moneylocal.application.port.`in`.RechargeMoneyUseCase
import jakarta.transaction.Transactional

@UseCase
@Transactional
class RechargeMoney : RechargeMoneyUseCase {
    override fun rechargeMoney(command: RechargeMoneyCommand) {
        // TODO: implement recharge logic for money-local-service
    }
}
