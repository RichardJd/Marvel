package br.com.rj.marvel.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Event.class)
public abstract class Event_ {

	public static volatile SingularAttribute<Event, Integer> available;
	public static volatile SingularAttribute<Event, Integer> id;
	public static volatile SingularAttribute<Event, Integer> returned;
	public static volatile ListAttribute<Event, EventSummary> items;

	public static final String AVAILABLE = "available";
	public static final String ID = "id";
	public static final String RETURNED = "returned";
	public static final String ITEMS = "items";

}

