package com.hmpay.money.adapter.in.web;

import com.hmpay.common.WebAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@WebAdapter
@RestController
@RequiredArgsConstructor
class RequestTransferMoneyController {

	// private final RegisterBankingAccountUseCase registerBankingAccountUseCase;

	@PostMapping(path = "/money/transfer")
	ResponseEntity<Object> requestTransferMoneyBetweenMembers(){
		return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
	}

}
