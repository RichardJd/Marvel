package br.com.rj.marvel.repository.filter;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class CharacterFilter {

	private String name;
	private String nameStartsWith;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate modifiedSince;
	
	private Integer comics;
	private Integer series;
	private Integer events;
	private Integer stories;
	
	private Integer limit;
	private Integer offset;
	
	public CharacterFilter() {
		limit = 20;
		offset = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameStartsWith() {
		return nameStartsWith;
	}

	public void setNameStartsWith(String nameStartsWith) {
		this.nameStartsWith = nameStartsWith;
	}

	public LocalDate getModifiedSince() {
		return modifiedSince;
	}

	public void setModifiedSince(LocalDate modifiedSince) {
		this.modifiedSince = modifiedSince;
	}

	public Integer getComics() {
		return comics;
	}

	public void setComics(Integer comics) {
		this.comics = comics;
	}

	public Integer getSeries() {
		return series;
	}

	public void setSeries(Integer series) {
		this.series = series;
	}

	public Integer getEvents() {
		return events;
	}

	public void setEvents(Integer events) {
		this.events = events;
	}

	public Integer getStories() {
		return stories;
	}

	public void setStories(Integer stories) {
		this.stories = stories;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}
}
