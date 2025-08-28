package com.hmpay.moneylocal

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "banking")
data class MoneyLocalConfigurationProperties(
    var transferThreshold: Long = Long.MAX_VALUE
)
