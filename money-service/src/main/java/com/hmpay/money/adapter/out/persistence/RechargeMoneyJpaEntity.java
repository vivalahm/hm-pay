package com.hmpay.money.adapter.out.persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "recharge_money")
@Data
@AllArgsConstructor
@NoArgsConstructor
class RechargeMoneyJpaEntity {

	@Id
	@GeneratedValue
	private Long rechargeMoneyId;

//	private String name;
//
//	private String address;
//
//	private String email;
//
//	private boolean isValid;

}
