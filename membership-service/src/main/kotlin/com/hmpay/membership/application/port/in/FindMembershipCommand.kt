package com.hmpay.membership.application.port.`in`

import com.hmpay.common.SelfValidating

// Kotlin data class equivalent of the original Java Lombok-based command
// Keeping parity with original API: field name and getter

data class FindMembershipCommand(
    val membershipId: String,
) : SelfValidating<FindMembershipCommand>()
