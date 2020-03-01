package br.com.rj.marvel.dto;

import java.util.List;

import br.com.rj.marvel.model.Comic;

public class ComicDTO {

	private Integer available;
	private Integer returned;
	private String collectionURI;
	private List<ComicSummaryDTO> items;
	
	public ComicDTO(Comic comic) {
		this.available = comic.getAvailable();
		this.returned = comic.getReturned();
		this.collectionURI = comic.getCollectionURI();
		this.items = ComicSummaryDTO.converter(comic.getItems());
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
	
	public List<ComicSummaryDTO> getItems() {
		return items;
	}

	public static ComicDTO converter(Comic comic) {
		return new ComicDTO(comic);
	}
}
