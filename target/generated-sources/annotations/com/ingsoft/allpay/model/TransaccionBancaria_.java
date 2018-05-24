package com.ingsoft.allpay.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TransaccionBancaria.class)
public abstract class TransaccionBancaria_ {

	public static volatile SingularAttribute<TransaccionBancaria, String> descripcion;
	public static volatile SingularAttribute<TransaccionBancaria, Integer> idTransaccion;
	public static volatile SingularAttribute<TransaccionBancaria, Date> fecha;
	public static volatile SingularAttribute<TransaccionBancaria, String> tipo;
	public static volatile SingularAttribute<TransaccionBancaria, CuentaBancaria> cuentaBancaria;
	public static volatile SingularAttribute<TransaccionBancaria, Float> valor;

}

