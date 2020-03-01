package br.com.rj.marvel.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.rj.marvel.model.Url;

public class UrlDTO {

	private String type;
	private String url;

	public UrlDTO(Url url) {
		this.type = url.getType();
		this.url = url.getUrl();
	}

	public String getType() {
		return type;
	}

	public String getUrl() {
		return url;
	}

	public static List<UrlDTO> converter(List<Url> url) {
		return url.stream().map(UrlDTO::new).collect(Collectors.toList());
	}
}
