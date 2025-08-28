package com.hmpay.moneylocal.domain

class MemberMoney private constructor(
    val memberMoneyId: String,
) {
    companion object {
        @JvmStatic
        fun generateMemberMoney(memberMoneyId: MemberMoneyId): MemberMoney = MemberMoney(memberMoneyId.memberMoneyId)
    }

    data class MemberMoneyId(
        val memberMoneyId: String,
    )
}
