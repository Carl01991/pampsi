package com.ingsoft.allpay.resultmodel;

import java.util.List;

public class HistoricoGeneralPorCiudadano {
	private List<HistoricoPorCiudadano> historico;
	private Float total;
	public List<HistoricoPorCiudadano> getHistorico() {
		return historico;
	}
	public void setHistorico(List<HistoricoPorCiudadano> historico) {
		this.historico = historico;
	}
	public Float getTotal() {
		return total;
	}
	public void setTotal(Float total) {
		this.total = total;
	}
	
 
}
