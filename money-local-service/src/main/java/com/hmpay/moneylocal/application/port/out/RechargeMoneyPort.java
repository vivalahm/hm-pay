package com.hmpay.moneylocal.application.port.out;


import com.hmpay.moneylocal.domain.MemberMoney;

public interface RechargeMoneyPort {

	void rechargeMoney(
			MemberMoney.MemberMoneyId memberMoneyId
	);
}
