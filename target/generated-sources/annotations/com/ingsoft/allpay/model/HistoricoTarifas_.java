package com.ingsoft.allpay.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(HistoricoTarifas.class)
public abstract class HistoricoTarifas_ {

	public static volatile SingularAttribute<HistoricoTarifas, String> descripcion;
	public static volatile SingularAttribute<HistoricoTarifas, Double> tarifa;
	public static volatile SingularAttribute<HistoricoTarifas, Integer> estado;
	public static volatile SingularAttribute<HistoricoTarifas, Integer> periodo;
	public static volatile SingularAttribute<HistoricoTarifas, DetalleServicio> detalleServicio;
	public static volatile SingularAttribute<HistoricoTarifas, Integer> idHistoricoTarifa;

}

