package com.ingsoft.allpay.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Municipalidad.class)
public abstract class Municipalidad_ {

	public static volatile SetAttribute<Municipalidad, ServiciosMuni> servicios;
	public static volatile SingularAttribute<Municipalidad, Integer> idMunicipalidad;
	public static volatile SingularAttribute<Municipalidad, String> codigoPostal;
	public static volatile SingularAttribute<Municipalidad, Municipio> municipio;
	public static volatile SingularAttribute<Municipalidad, String> categoria;
	public static volatile SingularAttribute<Municipalidad, String> direccion;
	public static volatile SingularAttribute<Municipalidad, String> nombre;

}

