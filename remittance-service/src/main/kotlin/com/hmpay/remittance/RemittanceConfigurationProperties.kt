package com.hmpay.remittance

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "banking")
data class RemittanceConfigurationProperties(
    var transferThreshold: Long = Long.MAX_VALUE
)
