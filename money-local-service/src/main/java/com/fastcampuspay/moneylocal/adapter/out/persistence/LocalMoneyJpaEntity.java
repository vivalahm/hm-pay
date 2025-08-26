package com.fastcampuspay.moneylocal.adapter.out.persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "local_money")
@Data
@AllArgsConstructor
@NoArgsConstructor
class LocalMoneyJpaEntity {

	@Id
	@GeneratedValue
	private Long localMoneyId;

//	private String name;
//
//	private String address;
//
//	private String email;
//
//	private boolean isValid;

}
