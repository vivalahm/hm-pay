package com.hmpay.membership.adapter.`in`.web

import com.hmpay.common.WebAdapter
import com.hmpay.membership.application.port.`in`.UpdateMembershipCommand
import com.hmpay.membership.application.port.`in`.UpdateMembershipUseCase
import com.hmpay.membership.domain.Membership
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@WebAdapter
@RestController
class UpdateMembershipController(
    private val updateMembershipUseCase: UpdateMembershipUseCase,
) {

    @PutMapping(path = ["/membership/update"])
    fun updateMembershipByMemberId(@RequestBody body: Map<String, Any?>): ResponseEntity<Membership> {
        val command = UpdateMembershipCommand(
            body["membershipId"] as? String ?: "",
            body["name"] as? String ?: "",
            body["address"] as? String ?: "",
            body["email"] as? String ?: "",
            (body["isValid"] as? Boolean) ?: false
        )
        return ResponseEntity.ok(updateMembershipUseCase.updateMembership(command))
    }

    @PutMapping(path = ["/membership/axon-update"])
    fun updateAxonMembershipByMemberId(@RequestBody body: Map<String, Any?>): ResponseEntity<Membership> {
        val command = UpdateMembershipCommand(
            body["membershipId"] as? String ?: "",
            body["name"] as? String,
            body["address"] as? String,
            body["email"] as? String,
            (body["isValid"] as? Boolean) ?: false
        )
        return ResponseEntity.ok(updateMembershipUseCase.updateAxonMembership(command))
    }
}
