package com.hmpay.money.application.service;


import com.hmpay.common.UseCase;
import com.hmpay.money.application.port.in.RechargeMoneyCommand;
import com.hmpay.money.application.port.in.RechargeMoneyUseCase;
import com.hmpay.money.application.port.out.RechargeMoneyPort;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;



@RequiredArgsConstructor
@UseCase
@Transactional
public class RechargeMoney implements RechargeMoneyUseCase {

	private final RechargeMoneyPort rport;

	@Override
	public void rechargeMoney(RechargeMoneyCommand command) {

	}
}




