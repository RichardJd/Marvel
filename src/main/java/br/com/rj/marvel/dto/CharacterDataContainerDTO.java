package br.com.rj.marvel.dto;

import java.util.List;

public class CharacterDataContainerDTO {

	private Integer offset;
	private Integer limit;
	private Integer total;
	private Integer count;
	private List<CharacterDTO> results;

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<CharacterDTO> getResults() {
		return results;
	}

	public void setResults(List<CharacterDTO> results) {
		this.results = results;
	}
}
