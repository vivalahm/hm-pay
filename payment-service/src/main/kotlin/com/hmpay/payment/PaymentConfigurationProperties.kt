package com.hmpay.payment

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "banking")
data class PaymentConfigurationProperties(
    var transferThreshold: Long = Long.MAX_VALUE
)
