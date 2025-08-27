package com.hmpay.moneylocal.adapter.out.persistence;

import com.hmpay.moneylocal.domain.MemberMoney;
import org.springframework.stereotype.Component;

@Component
class LocalMoneyMapper {
	MemberMoney mapToDomainEntity(
			LocalMoneyJpaEntity rechargeMoneyJpaEntity) {
		System.out.println(rechargeMoneyJpaEntity.toString());
		return MemberMoney.generateMemberMoney(
				new MemberMoney.MemberMoneyId(rechargeMoneyJpaEntity.getLocalMoneyId()+"")
				);
	}
}
