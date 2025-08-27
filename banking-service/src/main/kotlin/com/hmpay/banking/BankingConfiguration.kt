package com.hmpay.banking

import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@EnableConfigurationProperties(BankingConfigurationProperties::class)
class BankingConfiguration
