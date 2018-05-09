package com.ingsoft.allpay.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DetalleServicio.class)
public abstract class DetalleServicio_ {

	public static volatile SingularAttribute<DetalleServicio, ServiciosPrestados> servicios;
	public static volatile SingularAttribute<DetalleServicio, Integer> estado;
	public static volatile SetAttribute<DetalleServicio, HistoricoTarifas> tarifas;
	public static volatile SingularAttribute<DetalleServicio, Integer> idDetalleServicio;
	public static volatile SetAttribute<DetalleServicio, HistorialCobros> cobros;
	public static volatile SingularAttribute<DetalleServicio, String> nombre;

}

