package com.hmpay.membership.adapter.`in`.web

import com.hmpay.common.WebAdapter
import com.hmpay.membership.application.port.`in`.FindMembershipCommand
import com.hmpay.membership.application.port.`in`.FindMembershipUseCase
import com.hmpay.membership.domain.Membership
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@WebAdapter
@RestController
class FindMembershipController(
    private val findMembershipUseCase: FindMembershipUseCase,
) {
    @GetMapping(path = ["/membership/{membershipId}"])
    fun findMembershipByMemberId(@PathVariable membershipId: String): ResponseEntity<Membership> {
        val command = FindMembershipCommand(membershipId)
        return ResponseEntity.ok(findMembershipUseCase.findMembership(command))
    }

    @GetMapping(path = ["/membership/axon/{membershipId}"])
    fun findAxonMembershipByMemberId(@PathVariable membershipId: String): ResponseEntity<Membership?> {
        val command = FindMembershipCommand(membershipId)
        return ResponseEntity.ok(findMembershipUseCase.findAxonMembership(command))
    }
}
