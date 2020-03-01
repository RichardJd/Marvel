package br.com.rj.marvel.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.rj.marvel.model.EventSummary;

public class EventSummaryDTO {

	private String resourceURI;
	private String name;
	
	public EventSummaryDTO(EventSummary summary) {
		this.resourceURI = summary.getResourceURI();
		this.name = summary.getName();
	}

	public String getResourceURI() {
		return resourceURI;
	}

	public String getName() {
		return name;
	}
	
	public static List<EventSummaryDTO> converter(List<EventSummary> summary) {
		return summary.stream().map(EventSummaryDTO::new).collect(Collectors.toList());
	}
}
