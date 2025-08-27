package com.hmpay.settlement.application.port.out;


import com.hmpay.settlement.domain.MemberMoney;

public interface RechargeMoneyPort {

	void rechargeMoney(
			MemberMoney.MemberMoneyId memberMoneyId
	);
}
