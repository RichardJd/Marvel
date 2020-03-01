package br.com.rj.marvel.service;

import javax.servlet.http.HttpServletResponse;

import br.com.rj.marvel.dto.CharacterDataWrapperDTO;
import br.com.rj.marvel.repository.filter.CharacterFilter;

public interface CharacterService {

	public CharacterDataWrapperDTO getCharacters(HttpServletResponse response, CharacterFilter filter);
}
