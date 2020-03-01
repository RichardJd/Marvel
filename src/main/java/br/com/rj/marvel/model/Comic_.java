package br.com.rj.marvel.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Comic.class)
public abstract class Comic_ {

	public static volatile SingularAttribute<Comic, Integer> available;
	public static volatile SingularAttribute<Comic, Integer> id;
	public static volatile SingularAttribute<Comic, Integer> returned;
	public static volatile ListAttribute<Comic, ComicSummary> items;

	public static final String AVAILABLE = "available";
	public static final String ID = "id";
	public static final String RETURNED = "returned";
	public static final String ITEMS = "items";

}

