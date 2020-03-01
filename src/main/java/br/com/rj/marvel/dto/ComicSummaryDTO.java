package br.com.rj.marvel.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.rj.marvel.model.ComicSummary;

public class ComicSummaryDTO {

	private String resourceURI;
	private String name;
	
	public ComicSummaryDTO(ComicSummary summary) {
		this.resourceURI = summary.getResourceURI();
		this.name = summary.getName();
	}

	public String getResourceURI() {
		return resourceURI;
	}

	public String getName() {
		return name;
	}
	
	public static List<ComicSummaryDTO> converter(List<ComicSummary> summary) {
		return summary.stream().map(ComicSummaryDTO::new).collect(Collectors.toList());
	}
}
