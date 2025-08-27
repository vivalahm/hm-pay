package com.hmpay.membership.adapter.`in`.web

import com.hmpay.common.WebAdapter
import com.hmpay.membership.application.port.`in`.RegisterMembershipCommand
import com.hmpay.membership.application.port.`in`.RegisterMembershipUseCase
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@WebAdapter
@RestController
class RegisterMembershipController(
    private val registerMembershipUseCase: RegisterMembershipUseCase,
) {

    @PostMapping(path = ["/membership/register/"])
    fun registerMembership(@RequestBody request: Map<String, Any?>) {
        val command = RegisterMembershipCommand(
            request["name"] as? String ?: "",
            request["email"] as? String ?: "",
            request["address"] as? String ?: "",
            false
        )
        registerMembershipUseCase.registerMembership(command)
    }

    @PostMapping(path = ["/membership/axon-register/"])
    fun registerAxonMembership(@RequestBody request: Map<String, Any?>) {
        val command = RegisterMembershipCommand(
            request["name"] as? String ?: "",
            request["email"] as? String ?: "",
            request["address"] as? String ?: "",
            false
        )
        registerMembershipUseCase.registerAxonMembership(command)
    }
}
