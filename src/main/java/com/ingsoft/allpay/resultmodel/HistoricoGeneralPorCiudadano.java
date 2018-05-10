package com.ingsoft.allpay.resultmodel;

import java.util.List;

public class HistoricoGeneralPorCiudadano {
	private List<HistoricoPorCiudadano> historico;
	private Double total;
	public List<HistoricoPorCiudadano> getHistorico() {
		return historico;
	}
	public void setHistorico(List<HistoricoPorCiudadano> historico) {
		this.historico = historico;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	
 
}
