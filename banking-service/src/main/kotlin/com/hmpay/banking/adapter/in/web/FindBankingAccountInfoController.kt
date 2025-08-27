package com.hmpay.banking.adapter.`in`.web

import com.hmpay.common.WebAdapter
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@WebAdapter
@RestController
class FindBankingAccountInfoController {

    @GetMapping(path = ["/banking/registered-banking-account/"])
    fun findRegisteredBankingAccountByMemberId(): ResponseEntity<Any> =
        ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build()

    @GetMapping(path = ["/banking/transfer-money/"])
    fun findTransferMoneyInfoByMemberId(): ResponseEntity<Any> =
        ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build()

    @GetMapping(path = ["/banking/transfer-money-info/"])
    fun findTransferMoneyInfoByBankingId(): ResponseEntity<Any> =
        ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build()
}
