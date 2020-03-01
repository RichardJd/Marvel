package br.com.rj.marvel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rj.marvel.model.Character;
import br.com.rj.marvel.repository.character.CharacterRepositoryQuery;

@Repository
public interface CharacterRepository extends JpaRepository<Character, Long>, CharacterRepositoryQuery {

}
