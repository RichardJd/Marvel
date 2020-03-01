package br.com.rj.marvel.dto;

import java.util.List;

import br.com.rj.marvel.model.Story;

public class StoryDTO {

	private Integer available;
	private Integer returned;
	private String collectionURI;
	private List<StorySummaryDTO> items;
	
	public StoryDTO(Story story) {
		this.available = story.getAvailable();
		this.returned = story.getReturned();
		this.collectionURI = story.getCollectionURI();
		this.items = StorySummaryDTO.converter(story.getItems());
	}

	public Integer getAvailable() {
		return available;
	}

	public Integer getReturned() {
		return returned;
	}

	public String getCollectionURI() {
		return collectionURI;
	}
	
	public List<StorySummaryDTO> getItems() {
		return items;
	}

	public static StoryDTO converter(Story story) {
		return new StoryDTO(story);
	}
}
