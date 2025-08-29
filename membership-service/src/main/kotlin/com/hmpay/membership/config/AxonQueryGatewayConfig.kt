package com.hmpay.membership.config

import org.axonframework.queryhandling.QueryGateway
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class AxonQueryGatewayConfig {
    @Bean
    fun queryGateway(axonConfiguration: org.axonframework.config.Configuration): QueryGateway =
        axonConfiguration.queryGateway()
}
