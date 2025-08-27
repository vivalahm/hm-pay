package com.hmpay.remittance.adapter.`in`.web

import com.hmpay.common.WebAdapter
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@WebAdapter
@RestController
class FindRemittanceController {

    @GetMapping(path = ["/remittance/info"])
    fun findRemittanceInfoByRemittanceId(): ResponseEntity<Any> =
        ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build()

    @GetMapping(path = ["/remittance/history"])
    fun findRemittanceHistoryByMemberId(): ResponseEntity<Any> =
        ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build()

    @GetMapping(path = ["/remittance/transferred-money"])
    fun findMoneyTransferringByRemittanceId(): ResponseEntity<Any> =
        ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build()
}
