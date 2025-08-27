package com.hmpay.common.events

data class RegisterAccountEvent @JvmOverloads constructor(
    val accountId: String = "0000"
) {
    override fun toString(): String =
        "OrderCreatedEvent{" + "orderId='" + accountId + '\'' + '}'
}
