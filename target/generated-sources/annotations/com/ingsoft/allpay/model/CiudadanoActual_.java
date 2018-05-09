package com.ingsoft.allpay.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CiudadanoActual.class)
public abstract class CiudadanoActual_ {

	public static volatile SingularAttribute<CiudadanoActual, String> apellidos;
	public static volatile SingularAttribute<CiudadanoActual, String> cui;
	public static volatile SingularAttribute<CiudadanoActual, String> direccion;
	public static volatile SetAttribute<CiudadanoActual, HistorialCobros> cobros;
	public static volatile SingularAttribute<CiudadanoActual, String> nombres;

}

