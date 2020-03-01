package br.com.rj.marvel.repository.character;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.ListJoin;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.util.StringUtils;

import br.com.rj.marvel.model.Character;
import br.com.rj.marvel.model.Character_;
import br.com.rj.marvel.model.Comic;
import br.com.rj.marvel.model.ComicSummary;
import br.com.rj.marvel.model.ComicSummary_;
import br.com.rj.marvel.model.Comic_;
import br.com.rj.marvel.model.Event;
import br.com.rj.marvel.model.EventSummary;
import br.com.rj.marvel.model.EventSummary_;
import br.com.rj.marvel.model.Event_;
import br.com.rj.marvel.model.Serie;
import br.com.rj.marvel.model.SerieSummary;
import br.com.rj.marvel.model.SerieSummary_;
import br.com.rj.marvel.model.Serie_;
import br.com.rj.marvel.model.Story;
import br.com.rj.marvel.model.StorySummary;
import br.com.rj.marvel.model.StorySummary_;
import br.com.rj.marvel.model.Story_;
import br.com.rj.marvel.repository.filter.CharacterFilter;

public class CharacterRepositoryImpl implements CharacterRepositoryQuery {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<Character> getCharacters(CharacterFilter filter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Character> criteria = builder.createQuery(Character.class);

		Root<Character> root = criteria.from(Character.class);
		Join<Character, Comic> comic = root.join(Character_.comics);
		ListJoin<Comic, ComicSummary> comicSummary = comic.join(Comic_.items);
		Join<Character, Serie> serie = root.join(Character_.series);
		ListJoin<Serie, SerieSummary> serieSummary = serie.join(Serie_.items);
		Join<Character, Event> event = root.join(Character_.events);
		ListJoin<Event, EventSummary> eventSummary = event.join(Event_.items);
		Join<Character, Story> story = root.join(Character_.stories);
		ListJoin<Story, StorySummary> storySummary = story.join(Story_.items);
		criteria.distinct(true);

		Predicate[] predicates = createRestrictions(filter, builder, root, comicSummary, serieSummary, eventSummary,
				storySummary);
		criteria.where(predicates);

		TypedQuery<Character> query = manager.createQuery(criteria);
		query.setFirstResult(filter.getOffset() >= 0 ? (filter.getOffset()) : 0);
		return query.setMaxResults(filter.getLimit()).getResultList();
	}

	private Predicate[] createRestrictions(CharacterFilter filter, CriteriaBuilder builder, Root<Character> root,
			Join<Comic, ComicSummary> comicSummary, Join<Serie, SerieSummary> serieSummary,
			Join<Event, EventSummary> eventSummary, Join<Story, StorySummary> storySummary) {

		List<Predicate> predicates = new ArrayList<>();

		if (!StringUtils.isEmpty(filter.getName())) {
			predicates.add(builder.equal(builder.lower(root.get(Character_.name)), filter.getName().toLowerCase()));
		}

		if (!StringUtils.isEmpty(filter.getNameStartsWith())) {
			predicates.add(builder.like(builder.lower(root.get(Character_.name)),
					filter.getNameStartsWith().toLowerCase() + "%"));
		}

		if (filter.getModifiedSince() != null) {
			predicates.add(builder.greaterThanOrEqualTo(root.get(Character_.modified), filter.getModifiedSince()));
		}

		if (filter.getComics() != null) {
			predicates.add(builder.equal(comicSummary.get(ComicSummary_.id), filter.getComics()));
		}

		if (filter.getEvents() != null) {
			predicates.add(builder.equal(eventSummary.get(EventSummary_.id), filter.getEvents()));
		}

		if (filter.getSeries() != null) {
			predicates.add(builder.equal(serieSummary.get(SerieSummary_.id), filter.getSeries()));
		}

		if (filter.getStories() != null) {
			predicates.add(builder.equal(storySummary.get(StorySummary_.id), filter.getStories()));
		}

		return predicates.toArray(new Predicate[predicates.size()]);
	}

}
