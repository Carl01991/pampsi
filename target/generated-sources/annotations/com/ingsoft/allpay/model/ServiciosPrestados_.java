package com.ingsoft.allpay.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ServiciosPrestados.class)
public abstract class ServiciosPrestados_ {

	public static volatile SingularAttribute<ServiciosPrestados, String> nombreServicio;
	public static volatile SingularAttribute<ServiciosPrestados, String> descripcionServicio;
	public static volatile SingularAttribute<ServiciosPrestados, Integer> estado;
	public static volatile SingularAttribute<ServiciosPrestados, String> tipo;
	public static volatile SingularAttribute<ServiciosPrestados, String> cuentaBancaria;
	public static volatile SetAttribute<ServiciosPrestados, DetalleServicio> servicioDetalle;
	public static volatile SingularAttribute<ServiciosPrestados, Departamento> departamento;
	public static volatile SingularAttribute<ServiciosPrestados, Integer> idServicio;

}

