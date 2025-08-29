package com.hmpay.membership

import org.axonframework.queryhandling.QueryGateway
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringBootConfiguration
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration
import org.springframework.boot.test.context.SpringBootTest
import org.junit.jupiter.api.Assertions.assertNotNull

@SpringBootTest(classes = [OnlyAutoConfig::class])
class AxonBeanTest {
    @Autowired lateinit var queryGateway: QueryGateway

    @Test
    fun `should load QueryGateway bean from Axon auto-configuration`() {
        assertNotNull(queryGateway, "QueryGateway should be auto-configured by Axon")
    }
}

@SpringBootConfiguration
@EnableAutoConfiguration(
    exclude = [
        DataSourceAutoConfiguration::class,
        HibernateJpaAutoConfiguration::class,
    ]
)
class OnlyAutoConfig
