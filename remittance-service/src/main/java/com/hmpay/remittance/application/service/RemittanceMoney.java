package com.hmpay.remittance.application.service;


import com.hmpay.common.UseCase;
import com.hmpay.remittance.application.port.in.RemittanceMoneyCommand;
import com.hmpay.remittance.application.port.in.RemittanceMoneyUseCase;
import com.hmpay.remittance.application.port.out.RemittanceMoneyPort;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;



@RequiredArgsConstructor
@UseCase
@Transactional
public class RemittanceMoney implements RemittanceMoneyUseCase {

	private final RemittanceMoneyPort rport;

	@Override
	public void remittanceMoney(RemittanceMoneyCommand command) {

	}
}




