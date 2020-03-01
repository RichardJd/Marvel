package br.com.rj.marvel.resource;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	public CharacterDataWrapperDTO getCharacteres(HttpServletResponse response, CharacterFilter filter) {
		return service.getCharacters(response, filter);
	}
}
