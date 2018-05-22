package com.ingsoft.allpay.resultmodel;

import com.ingsoft.allpay.dao.ResponseGenricValue;

public class SaldosResponse extends ResponseGenricValue{
	private Double saldo;

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public SaldosResponse(Double saldo) {
		super();
		this.saldo = saldo;
	}
	
	public SaldosResponse() {
		super();
	}

}
