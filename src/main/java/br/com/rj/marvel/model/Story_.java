package br.com.rj.marvel.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Story.class)
public abstract class Story_ {

	public static volatile SingularAttribute<Story, Integer> available;
	public static volatile SingularAttribute<Story, Integer> id;
	public static volatile SingularAttribute<Story, Integer> returned;
	public static volatile ListAttribute<Story, StorySummary> items;

	public static final String AVAILABLE = "available";
	public static final String ID = "id";
	public static final String RETURNED = "returned";
	public static final String ITEMS = "items";

}

