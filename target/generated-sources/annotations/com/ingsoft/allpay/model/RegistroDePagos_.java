package com.ingsoft.allpay.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(RegistroDePagos.class)
public abstract class RegistroDePagos_ {

	public static volatile SingularAttribute<RegistroDePagos, Date> fecha;
	public static volatile SingularAttribute<RegistroDePagos, Integer> idHistoricoCobro;
	public static volatile SingularAttribute<RegistroDePagos, Float> valor;
	public static volatile SingularAttribute<RegistroDePagos, Integer> id;
	public static volatile SingularAttribute<RegistroDePagos, String> documentoIdentificacion;

}

