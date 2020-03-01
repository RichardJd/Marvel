package br.com.rj.marvel.repository.character;

import java.util.List;

import br.com.rj.marvel.model.Character;
import br.com.rj.marvel.repository.filter.CharacterFilter;

public interface CharacterRepositoryQuery {

	public List<Character> getCharacters(CharacterFilter filter);
}
