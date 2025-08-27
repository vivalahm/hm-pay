package com.hmpay.money.adapter.out.persistence;

import com.hmpay.money.domain.MemberMoney;
import org.springframework.stereotype.Component;

@Component
class RechargeMoneyMapper {
	MemberMoney mapToDomainEntity(
			RechargeMoneyJpaEntity rechargeMoneyJpaEntity) {
		System.out.println(rechargeMoneyJpaEntity.toString());
		return MemberMoney.generateMemberMoney(
				new MemberMoney.MemberMoneyId(rechargeMoneyJpaEntity.getRechargeMoneyId()+"")
				);
	}
}
