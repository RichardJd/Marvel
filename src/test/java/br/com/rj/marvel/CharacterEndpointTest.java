package br.com.rj.marvel;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import br.com.rj.marvel.repository.CharacterRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@EnableAutoConfiguration
public class CharacterEndpointTest {

	@Autowired
	private RestTemplate restTemplate;

	@LocalServerPort
	private int port;

	@MockBean
	private CharacterRepository repository;

	@Test
	public void listCharactersEndpointWithStatusCode200() {
		ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8080/v1/public/characters",
				String.class);
		assertThat(response.getStatusCodeValue()).isEqualTo(200);
	}

	@Test
	public void listCharacterIdEndpointWithStatusCode200() {
		ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8080/v1/public/characters/2",
				String.class);
		assertThat(response.getStatusCodeValue()).isEqualTo(200);
	}
}
