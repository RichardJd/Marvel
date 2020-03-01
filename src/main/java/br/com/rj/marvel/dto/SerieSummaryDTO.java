package br.com.rj.marvel.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.rj.marvel.model.SerieSummary;

public class SerieSummaryDTO {

	private String resourceURI;
	private String name;
	
	public SerieSummaryDTO(SerieSummary summary) {
		this.resourceURI = summary.getResourceURI();
		this.name = summary.getName();
	}

	public String getResourceURI() {
		return resourceURI;
	}

	public String getName() {
		return name;
	}
	
	public static List<SerieSummaryDTO> converter(List<SerieSummary> summary) {
		return summary.stream().map(SerieSummaryDTO::new).collect(Collectors.toList());
	}
}
