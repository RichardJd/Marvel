package br.com.rj.marvel.model;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Character.class)
public abstract class Character_ {

	public static volatile ListAttribute<Character, Url> urls;
	public static volatile SingularAttribute<Character, Story> stories;
	public static volatile SingularAttribute<Character, Serie> series;
	public static volatile SingularAttribute<Character, Image> thumbnall;
	public static volatile SingularAttribute<Character, Comic> comics;
	public static volatile SingularAttribute<Character, String> name;
	public static volatile SingularAttribute<Character, String> description;
	public static volatile SingularAttribute<Character, LocalDate> modified;
	public static volatile SingularAttribute<Character, Integer> id;
	public static volatile SingularAttribute<Character, Event> events;

	public static final String URLS = "urls";
	public static final String STORIES = "stories";
	public static final String SERIES = "series";
	public static final String THUMBNALL = "thumbnall";
	public static final String COMICS = "comics";
	public static final String NAME = "name";
	public static final String DESCRIPTION = "description";
	public static final String MODIFIED = "modified";
	public static final String ID = "id";
	public static final String EVENTS = "events";

}

