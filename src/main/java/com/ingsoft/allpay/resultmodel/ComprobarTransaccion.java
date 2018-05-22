package com.ingsoft.allpay.resultmodel;

import com.ingsoft.allpay.dao.ResponseGeneric;
import com.ingsoft.allpay.dao.ResponseGenricValue;

public class ComprobarTransaccion extends ResponseGenricValue{
	private boolean estado;

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	

}
