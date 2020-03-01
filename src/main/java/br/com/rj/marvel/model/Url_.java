package br.com.rj.marvel.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Url.class)
public abstract class Url_ {

	public static volatile SingularAttribute<Url, Integer> id;
	public static volatile SingularAttribute<Url, String> type;
	public static volatile SingularAttribute<Url, String> url;

	public static final String ID = "id";
	public static final String TYPE = "type";
	public static final String URL = "url";

}

