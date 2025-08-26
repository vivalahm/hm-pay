package com.fastcampuspay.remittance.adapter.out.persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "remittance_money")
@Data
@AllArgsConstructor
@NoArgsConstructor
class RemittanceMoneyJpaEntity {
	@Id
	@GeneratedValue
	private Long remittanceMoneyId;

//	private String name;
//
//	private String address;
//
//	private String email;
//
//	private boolean isValid;

}
