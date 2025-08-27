package com.hmpay.membership.adapter.`in`.web

import com.hmpay.common.WebAdapter
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@WebAdapter
@RestController
class LoginAuthMembershipController {

    @PostMapping(path = ["/membership/login/"])
    fun loginByMembershipIdPw(): ResponseEntity<Any> =
        ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build()

    @PostMapping(path = ["/membership/auth/"])
    fun authByToken(): ResponseEntity<Any> =
        ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build()
}
