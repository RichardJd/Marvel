package br.com.rj.marvel.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Image.class)
public abstract class Image_ {

	public static volatile SingularAttribute<Image, String> path;
	public static volatile SingularAttribute<Image, String> extension;
	public static volatile SingularAttribute<Image, Integer> id;

	public static final String PATH = "path";
	public static final String EXTENSION = "extension";
	public static final String ID = "id";

}

