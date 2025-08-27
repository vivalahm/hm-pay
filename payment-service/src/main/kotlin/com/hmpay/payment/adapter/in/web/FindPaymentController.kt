package com.hmpay.payment.adapter.`in`.web

import com.hmpay.common.WebAdapter
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@WebAdapter
@RestController
class FindPaymentController {

    @GetMapping(path = ["/payment/info"])
    fun findPaymentByPaymentId(): ResponseEntity<Any> =
        ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build()

    @GetMapping(path = ["/payment/list-by-period"])
    fun listPaymentsByPeriod(): ResponseEntity<Any> =
        ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build()
}
