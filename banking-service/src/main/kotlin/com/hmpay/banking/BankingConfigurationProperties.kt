package com.hmpay.banking

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "banking")
data class BankingConfigurationProperties(
    var transferThreshold: Long = Long.MAX_VALUE
)
