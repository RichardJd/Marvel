package br.com.rj.marvel;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.rj.marvel.model.Character;
import br.com.rj.marvel.repository.CharacterRepository;
import br.com.rj.marvel.repository.filter.CharacterFilter;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class CharacterRepositoryTest {

	@Autowired
	private CharacterRepository repository;

	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void findAllData() {
		CharacterFilter filter = new CharacterFilter();
		List<Character> characters =  repository.getCharacters(filter);
		assertThat(characters.size()).isEqualTo(5);
	}
	
	@Test
	public void findByIdData() {
		Character returnedCharacter =  repository.findById(2).get();
		assertThat(returnedCharacter.getName().equals("Hulk"));
	}
	
	@Test
	public void findAllDataWhereNameIsEqualThor() {
		CharacterFilter filter = new CharacterFilter();
		filter.setName("Thor");
		List<Character> characters = repository.getCharacters(filter);
		assertThat(characters.get(0).getName().equals("Thor"));
	}
}
