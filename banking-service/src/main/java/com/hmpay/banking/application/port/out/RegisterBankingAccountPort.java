package com.hmpay.banking.application.port.out;


import com.hmpay.banking.domain.BankingAccountRegisterInfo;

public interface RegisterBankingAccountPort {

	void registerBankingAccount(
			BankingAccountRegisterInfo.BankingAccountRegisterInfoId bankingAccountRegisterInfoId
	);
}
