package com.hmpay.money.adapter.out.persistence;

import com.hmpay.common.PersistenceAdapter;
import com.hmpay.money.application.port.out.RechargeMoneyPort;
import com.hmpay.money.domain.MemberMoney;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@PersistenceAdapter
class RechargeMoneyPersistenceAdapter implements RechargeMoneyPort {

//	private final SpringDataRechargeMoneyRepository rechargeMoneyRepository;
//	private final RechargeMoneyMapper rechargeMoneyMapper;

	@Override
	public void rechargeMoney(MemberMoney.MemberMoneyId memberMoneyId) {

	}
}
