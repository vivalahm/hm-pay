package com.hmpay.moneylocal.adapter.out.persistence;

import com.hmpay.common.PersistenceAdapter;
import com.hmpay.moneylocal.application.port.out.RechargeMoneyPort;
import com.hmpay.moneylocal.domain.MemberMoney;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@PersistenceAdapter
class LocalMoneyPersistenceAdapter implements RechargeMoneyPort {

//	private final SpringDataRechargeMoneyRepository rechargeMoneyRepository;
//	 private final RechargeMoneyMapper rechargeMoneyMapper;

	@Override
	public void rechargeMoney(MemberMoney.MemberMoneyId memberMoneyId) {

	}
}
