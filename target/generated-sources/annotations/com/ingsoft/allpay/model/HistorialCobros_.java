package com.ingsoft.allpay.model;

import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(HistorialCobros.class)
public abstract class HistorialCobros_ {

	public static volatile SingularAttribute<HistorialCobros, Integer> idHistoricoCobros;
	public static volatile SingularAttribute<HistorialCobros, HistoricoTarifas> tarifaAplicada;
	public static volatile SingularAttribute<HistorialCobros, Date> fecha;
	public static volatile SingularAttribute<HistorialCobros, Integer> pagado;
	public static volatile SingularAttribute<HistorialCobros, DetalleServicio> detalleServicio;
	public static volatile SingularAttribute<HistorialCobros, Double> valor;
	public static volatile SingularAttribute<HistorialCobros, String> documentoIdentificacion;

}

