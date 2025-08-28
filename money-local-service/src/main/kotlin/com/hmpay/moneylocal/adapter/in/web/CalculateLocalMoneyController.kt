package com.hmpay.moneylocal.adapter.`in`.web

import com.hmpay.common.WebAdapter
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

// CQRS Controller
@WebAdapter
@RestController
class CalculateLocalMoneyController {

    @GetMapping(path = ["/money-local/calculate-money-sum"])
    fun calculateMoneySumByLocal(): ResponseEntity<Any> =
        ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build()
}
