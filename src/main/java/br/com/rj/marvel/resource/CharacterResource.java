package br.com.rj.marvel.resource;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rj.marvel.dto.CharacterDataWrapperDTO;
import br.com.rj.marvel.repository.filter.CharacterFilter;
import br.com.rj.marvel.service.impl.CharacterServiceImpl;

@RestController
@RequestMapping("/v1/public/characteres")
public class CharacterResource {

	@Autowired
	private CharacterServiceImpl service;

	@GetMapping
	public ResponseEntity<CharacterDataWrapperDTO> getCharacteres(HttpServletResponse response,
			CharacterFilter filter) {
		if (filter.getLimit() > 100 || filter.getLimit() < 1)
			return ResponseEntity.status(HttpStatus.CONFLICT).build();

		return ResponseEntity.status(HttpStatus.OK).body(service.getCharacters(response, filter));
	}

	@GetMapping("/{id}")
	public ResponseEntity<CharacterDataWrapperDTO> getCharacter(@PathVariable Integer id, HttpServletResponse response,
			CharacterFilter filter) {
		CharacterDataWrapperDTO dto = service.getCharacter(id, response, filter);
		return !dto.getData().getResults().isEmpty() ? ResponseEntity.ok(dto) : ResponseEntity.notFound().build();
	}
}
