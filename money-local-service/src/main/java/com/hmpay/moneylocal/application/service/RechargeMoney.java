package com.hmpay.moneylocal.application.service;


import com.hmpay.common.UseCase;
import com.hmpay.moneylocal.application.port.in.RechargeMoneyCommand;
import com.hmpay.moneylocal.application.port.in.RechargeMoneyUseCase;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;



@RequiredArgsConstructor
@UseCase
@Transactional
public class RechargeMoney implements RechargeMoneyUseCase {


	@Override
	public void rechargeMoney(RechargeMoneyCommand command) {

	}
}




