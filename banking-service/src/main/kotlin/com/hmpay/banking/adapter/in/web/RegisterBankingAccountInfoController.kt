package com.hmpay.banking.adapter.`in`.web

import com.hmpay.banking.application.port.`in`.RegisterBankingAccountCommand
import com.hmpay.banking.application.port.`in`.RegisterBankingAccountUseCase
import com.hmpay.common.WebAdapter
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@WebAdapter
@RestController
class RegisterBankingAccountInfoController(
    private val registerBankingAccountUseCase: RegisterBankingAccountUseCase,
) {

    @PostMapping(path = ["/banking/account/"])
    fun registerBankingAccount(@RequestBody request: Map<String, Any?>) {
        val command = RegisterBankingAccountCommand(
            request["name"] as? String ?: "",
            request["email"] as? String ?: "",
            request["address"] as? String ?: "",
            false
        )
        registerBankingAccountUseCase.registerBankingAccount(command)
    }
}
