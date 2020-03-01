package br.com.rj.marvel.dto;

import java.util.List;

import br.com.rj.marvel.model.Serie;

public class SerieDTO {

	private Integer available;
	private Integer returned;
	private String collectionURI;
	private List<SerieSummaryDTO> items;

	public SerieDTO(Serie serie) {
		this.available = serie.getAvailable();
		this.returned = serie.getReturned();
		this.collectionURI = serie.getCollectionURI();
		this.items = SerieSummaryDTO.converter(serie.getItems());
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

	public List<SerieSummaryDTO> getItems() {
		return items;
	}

	public static SerieDTO converter(Serie serie) {
		return new SerieDTO(serie);
	}
}
