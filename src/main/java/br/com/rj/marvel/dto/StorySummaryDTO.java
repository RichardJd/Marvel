package br.com.rj.marvel.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.rj.marvel.model.StorySummary;

public class StorySummaryDTO {

	private String resourceURI;
	private String name;
	private String type;
	
	public StorySummaryDTO(StorySummary summary) {
		this.resourceURI = summary.getResourceURI();
		this.name = summary.getName();
		this.type = summary.getType();
	}

	public String getResourceURI() {
		return resourceURI;
	}

	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;
	}

	public static List<StorySummaryDTO> converter(List<StorySummary> summary) {
		return summary.stream().map(StorySummaryDTO::new).collect(Collectors.toList());
	}
}
