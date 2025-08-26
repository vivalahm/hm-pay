package com.fastcampuspay.money.application.service;


import com.fastcampuspay.common.UseCase;
import com.fastcampuspay.money.application.port.in.RechargeMoneyCommand;
import com.fastcampuspay.money.application.port.in.RechargeMoneyUseCase;
import com.fastcampuspay.money.application.port.out.RechargeMoneyPort;
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




