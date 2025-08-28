package com.hmpay.moneylocal.application.port.`in`

import com.hmpay.common.SelfValidating
import jakarta.validation.constraints.NotNull

data class RechargeMoneyCommand(
    @field:NotNull val name: String,
    @field:NotNull val email: String,
    @field:NotNull val address: String,
    @field:NotNull val isValid: Boolean,
) : SelfValidating<RechargeMoneyCommand>()
