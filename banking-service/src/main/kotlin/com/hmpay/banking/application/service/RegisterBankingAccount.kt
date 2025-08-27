package com.hmpay.banking.application.service

import com.hmpay.banking.application.port.`in`.RegisterBankingAccountCommand
import com.hmpay.banking.application.port.`in`.RegisterBankingAccountUseCase
import com.hmpay.banking.application.port.out.RegisterBankingAccountPort
import com.hmpay.banking.domain.BankingAccountRegisterInfo
import com.hmpay.common.UseCase
import jakarta.transaction.Transactional

@UseCase
@Transactional
class RegisterBankingAccount(
    private val rport: RegisterBankingAccountPort,
) : RegisterBankingAccountUseCase {

    override fun registerBankingAccount(command: RegisterBankingAccountCommand) {
        rport.registerBankingAccount(
            BankingAccountRegisterInfo.BankingAccountRegisterInfoId(command.email)
        )
    }
}
