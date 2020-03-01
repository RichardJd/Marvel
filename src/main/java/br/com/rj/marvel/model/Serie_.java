package br.com.rj.marvel.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Serie.class)
public abstract class Serie_ {

	public static volatile SingularAttribute<Serie, Integer> available;
	public static volatile SingularAttribute<Serie, Integer> id;
	public static volatile SingularAttribute<Serie, Integer> returned;
	public static volatile ListAttribute<Serie, SerieSummary> items;

	public static final String AVAILABLE = "available";
	public static final String ID = "id";
	public static final String RETURNED = "returned";
	public static final String ITEMS = "items";

}

