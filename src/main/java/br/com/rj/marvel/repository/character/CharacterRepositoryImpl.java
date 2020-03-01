package br.com.rj.marvel.repository.character;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.util.StringUtils;

import br.com.rj.marvel.model.Character;
import br.com.rj.marvel.repository.filter.CharacterFilter;

public class CharacterRepositoryImpl implements CharacterRepositoryQuery {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<Character> getCharacters(CharacterFilter filter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Character> criteria = builder.createQuery(Character.class);
		Root<Character> root = criteria.from(Character.class);

		// TODO criar as restrições
		Predicate[] predicates = createRestrictions(filter, builder, root);
		criteria.where(predicates);

		TypedQuery<Character> query = manager.createQuery(criteria);
		return query.getResultList();
	}

	private Predicate[] createRestrictions(CharacterFilter filter, CriteriaBuilder builder, Root<Character> root) {
		
		List<Predicate> predicates = new ArrayList<>();
		
		if (!StringUtils.isEmpty(filter.getName())) {
			predicates.add(builder.equal(
					builder.lower(root.get("name")), filter.getName().toLowerCase()));
		}
		
		if (filter.getNameStartsWith() != null) {
			
		}
		
		if (filter.getModifiedSince() != null) {
			
		}
		
		if (filter.getComics() != null) {
			
		}
		
		if (filter.getEvents() != null) {
			
		}
		
		if (filter.getSeries() != null) {
			
		}
		
		if (filter.getStories() != null) {
			
		}
		
		return predicates.toArray(new Predicate[predicates.size()]);
	}

}
