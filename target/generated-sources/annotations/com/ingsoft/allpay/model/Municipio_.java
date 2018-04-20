package com.ingsoft.allpay.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Municipio.class)
public abstract class Municipio_ {

	public static volatile SingularAttribute<Municipio, Integer> idMunicipio;
	public static volatile SingularAttribute<Municipio, Departamento> departamento;
	public static volatile SetAttribute<Municipio, Municipalidad> municipalidades;
	public static volatile SingularAttribute<Municipio, String> nombre;

}

