package br.com.rj.marvel.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.rj.marvel.dto.CharacterDTO;
import br.com.rj.marvel.dto.CharacterDataWrapperDTO;
import br.com.rj.marvel.model.Character;
import br.com.rj.marvel.model.ComicSummary;
import br.com.rj.marvel.model.EventSummary;
import br.com.rj.marvel.model.SerieSummary;
import br.com.rj.marvel.model.StorySummary;
import br.com.rj.marvel.repository.CharacterRepository;
import br.com.rj.marvel.repository.filter.CharacterFilter;
import br.com.rj.marvel.service.CharacterService;

@Service
public class CharacterServiceImpl implements CharacterService {

	@Autowired
	private CharacterRepository repository;

	@Override
	public CharacterDataWrapperDTO getCharacters(HttpServletResponse response, CharacterFilter filter) {
		List<Character> characters = repository.getCharacters(filter);
		Long total = repository.count();
		getURIS(characters);

		List<CharacterDTO> charactersDTO = CharacterDTO.converter(characters);
		CharacterDataWrapperDTO wrapper = getWrapper(response, filter, characters, total, charactersDTO);

		return wrapper;
	}
	
	@Override
	public CharacterDataWrapperDTO getCharacter(Integer id, HttpServletResponse response, CharacterFilter filter) {
		Optional<Character> character = repository.findById(id);
		List<Character> characters = new ArrayList<>();
		if (character.isPresent())
			characters.add(character.get());
		getURIS(characters);
		
		List<CharacterDTO> charactersDTO = CharacterDTO.converter(characters);
		CharacterDataWrapperDTO wrapper = getWrapper(response, filter, characters, 1L, charactersDTO);
		return wrapper;
	}

	private CharacterDataWrapperDTO getWrapper(HttpServletResponse response, CharacterFilter filter,
			List<Character> characters, Long total, List<CharacterDTO> charactersDTO) {
		
		CharacterDataWrapperDTO wrapper = new CharacterDataWrapperDTO();
		wrapper.setCode(response.getStatus());
		wrapper.setStatus(HttpStatus.valueOf(wrapper.getCode()).toString().substring(4));
		wrapper.getData().setOffset(filter.getOffset() >= 0 ? (filter.getOffset()) : 0);
		wrapper.getData().setLimit(filter.getLimit());
		wrapper.getData().setTotal(total.intValue());
		wrapper.getData().setCount(characters.size());
		wrapper.getData().setResults(charactersDTO);
		
		return wrapper;
	}
	
	private void getURIS(List<Character> characters) {
		for (Character ch : characters) {
			String uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}").buildAndExpand(ch.getId())
					.toString();
			ch.setResourceURI(uri);
			ch.getComics().setCollectionURI(getURIComics(uri));
			ch.getStories().setCollectionURI(getURIStories(uri));
			ch.getEvents().setCollectionURI(getURIEvents(uri));
			ch.getSeries().setCollectionURI(getURISeries(uri));
			
			getURIComicsItem(ch.getComics().getItems(), getURIComics(uri));
			getURIStoriesItem(ch.getStories().getItems(), getURIStories(uri));
			getURIEventsItem(ch.getEvents().getItems(), getURIEvents(uri));
			getURISeriesItem(ch.getSeries().getItems(), getURISeries(uri));
		}
	}
	
	private String getURIComics(String uri) {
		return uri + "/comics/";
	}
	
	private String getURIStories(String uri) {
		return uri + "/stories/";
	}
	
	private String getURIEvents(String uri) {
		return uri + "/events/";
	}
	
	private String getURISeries(String uri) {
		return uri + "/series/";
	}
	
	private void getURIComicsItem(List<ComicSummary> summaries, String uri) {
		for (ComicSummary cs :  summaries) {
			cs.setResourceURI(uri + cs.getId());
		}
	}
	
	private void getURIStoriesItem(List<StorySummary> summaries, String uri) {
		for (StorySummary ss :  summaries) {
			ss.setResourceURI(uri + ss.getId());
		}
	}
	
	private void getURIEventsItem(List<EventSummary> summaries, String uri) {
		for (EventSummary es :  summaries) {
			es.setResourceURI(uri + es.getId());
		}
	}
	
	private void getURISeriesItem(List<SerieSummary> summaries, String uri) {
		for (SerieSummary ss :  summaries) {
			ss.setResourceURI(uri + ss.getId());
		}
	}
}
