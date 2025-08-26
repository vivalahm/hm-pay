package com.fastcampuspay.payment.adapter.out.persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "payment")
@Data
@AllArgsConstructor
@NoArgsConstructor
class PaymentJpaEntity {

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
