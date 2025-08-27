package com.hmpay.settlement

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "banking")
data class SettlementConfigurationProperties(
    var transferThreshold: Long = Long.MAX_VALUE
)
