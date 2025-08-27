package com.hmpay.membership

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "membership")
data class MembershipConfigurationProperties(
    var transferThreshold: Long = Long.MAX_VALUE
)
