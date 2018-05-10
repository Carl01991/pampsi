package com.ingsoft.allpay.dao;

import java.util.ArrayList;
import java.util.List;

import com.ingsoft.allpay.resultmodel.HistoricoGeneralPorCiudadano;

public class ResponseGeneric<T> {
	private String code;
	private String message;
	private List<T> response = new ArrayList<T>();
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<T> getResponse() {
		return response;
	}
	public void setResponse(List<T> response) {
		this.response = response;
	}

	
	

}
