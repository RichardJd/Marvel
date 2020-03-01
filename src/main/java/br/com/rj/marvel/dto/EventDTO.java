package br.com.rj.marvel.dto;

import java.util.List;

import br.com.rj.marvel.model.Event;

public class EventDTO {

	private Integer available;
	private Integer returned;
	private String collectionURI;
	private List<EventSummaryDTO> items;
	
	public EventDTO(Event event) {
		this.available = event.getAvailable();
		this.returned = event.getReturned();
		this.collectionURI = event.getCollectionURI();
		this.items = EventSummaryDTO.converter(event.getItems());
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
	
	public List<EventSummaryDTO> getItems() {
		return items;
	}

	public static EventDTO converter(Event event) {
		return new EventDTO(event);
	}
}
