package com.hmpay.banking.adapter.`in`.web

import com.hmpay.common.WebAdapter
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@WebAdapter
@RestController
class RequestTransferMoneyController {

    @PostMapping(path = ["/banking/transfer-money"])
    fun requestTransferMoneyToBank(): ResponseEntity<Any> =
        ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build()
}
