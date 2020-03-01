package br.com.rj.marvel.dto;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import br.com.rj.marvel.model.Character;

public class CharacterDTO {

	private Integer id;
	private String name;
	private String description;
	private LocalDate modified;
	private String resourceURI;
	private ImageDTO thumbnall;
	private ComicDTO comics;
	private StoryDTO stories;
	private EventDTO events;
	private SerieDTO series;

	private List<UrlDTO> urls;

	public CharacterDTO(Character character) {
		this.id = character.getId();
		this.name = character.getName();
		this.description = character.getDescription();
		this.modified = character.getModified();
		this.resourceURI = character.getResourceURI();

		this.thumbnall = ImageDTO.converter(character.getThumbnall());
		this.urls = UrlDTO.converter(character.getUrls());
		this.comics = ComicDTO.converter(character.getComics());
		this.stories = StoryDTO.converter(character.getStories());
		this.events = EventDTO.converter(character.getEvents());
		this.series = SerieDTO.converter(character.getSeries());
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public LocalDate getModified() {
		return modified;
	}

	public String getResourceURI() {
		return resourceURI;
	}

	public ImageDTO getThumbnall() {
		return thumbnall;
	}

	public ComicDTO getComics() {
		return comics;
	}

	public StoryDTO getStories() {
		return stories;
	}

	public EventDTO getEvents() {
		return events;
	}

	public SerieDTO getSeries() {
		return series;
	}

	public List<UrlDTO> getUrls() {
		return urls;
	}

	public static List<CharacterDTO> converter(List<Character> character) {
		return character.stream().map(CharacterDTO::new).collect(Collectors.toList());
	}
}
