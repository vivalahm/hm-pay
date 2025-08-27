package com.hmpay.remittance.application.port.out;


import com.hmpay.remittance.domain.RemittanceMoney;

public interface RemittanceMoneyPort {

	void remittanceMoney(
			RemittanceMoney.RemittanceMoneyId remittanceMoneyId
	);
}
