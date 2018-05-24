package com.ingsoft.allpay.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CuentaBancaria.class)
public abstract class CuentaBancaria_ {

	public static volatile SingularAttribute<CuentaBancaria, String> noCuenta;
	public static volatile SingularAttribute<CuentaBancaria, Integer> tipo;
	public static volatile SetAttribute<CuentaBancaria, TransaccionBancaria> transaccionBancaria;
	public static volatile SingularAttribute<CuentaBancaria, Banco> banco;
	public static volatile SingularAttribute<CuentaBancaria, String> documentoIdentificacion;
	public static volatile SingularAttribute<CuentaBancaria, Integer> idCuenta;

}

