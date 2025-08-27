package com.hmpay.membership.application.service

import com.hmpay.common.UseCase
import com.hmpay.membership.application.port.`in`.FindMembershipCommand
import com.hmpay.membership.application.port.`in`.FindMembershipUseCase
import com.hmpay.membership.application.port.`out`.FindMembershipPort
import com.hmpay.membership.application.port.`out`.query.FindMembershipQuery
import com.hmpay.membership.domain.Membership
import jakarta.transaction.Transactional
import org.axonframework.messaging.responsetypes.ResponseTypes
import org.axonframework.queryhandling.QueryGateway

@UseCase
@Transactional
class FindMembership(
    private val fport: FindMembershipPort,
    private val queryGateway: QueryGateway,
) : FindMembershipUseCase {
    override fun findMembership(command: FindMembershipCommand): Membership =
        fport.findMembership(Membership.MembershipId(command.membershipId))

    override fun findAxonMembership(command: FindMembershipCommand): Membership? {
        val getQuery = FindMembershipQuery(command.membershipId)
        queryGateway
            .query(getQuery, ResponseTypes.instanceOf(Membership::class.java))
            .whenComplete { result: Any?, throwable: Throwable? ->
                if (throwable == null) {
                    println(result.toString())
                } else {
                    println("error : ${throwable.message}")
                }
            }
        return null
    }
}
