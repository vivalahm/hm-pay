package com.hmpay.banking.adapter.out.persistence;

import com.hmpay.banking.domain.BankingAccountRegisterInfo;
import org.springframework.stereotype.Component;

@Component
class BankingAccountRegisterInfoMapper {
	BankingAccountRegisterInfo mapToDomainEntity(
			BankingAccountRegisterInfoJpaEntity bankingAccountRegisterInfoJpaEntity) {
		System.out.println(bankingAccountRegisterInfoJpaEntity.toString());
		return BankingAccountRegisterInfo.generateBankingAccountRegisterInfo(
				new BankingAccountRegisterInfo.BankingAccountRegisterInfoId(bankingAccountRegisterInfoJpaEntity.getRegisterInfoId()+"")
				);
	}
}
