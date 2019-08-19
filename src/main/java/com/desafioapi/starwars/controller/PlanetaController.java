package com.desafioapi.starwars.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafioapi.starwars.model.Planeta;
import com.desafioapi.starwars.repository.PlanetaRepository;
import com.desafioapi.starwars.service.PlanetaService;

//O Controller é a classe responsável por expor cada URI que estará disponível na API.
//O código inicial está listado abaixo:

//A anotação @RestController contém as anotações @Controller e @ResponseBody (pode omitir essas duas para deixar o código mais limpo).
// A anotação @Controller representa uma classe com endpoints (URIs que serão expostas pela API)
// e a classe indica que o valor retornado pelos métodos devem ser vinculados ao corpo da resposta (response body).

// A anotação @RequestMapping("/planetas") indica que a URL da API desse controller começa com /planetas, 
// isso significa que pode-se acessar usando a URL http://localhost:8080/planetas (acesso local).

@RestController
@RequestMapping("/planetas")
public class PlanetaController {
	
	
	@Autowired
	private PlanetaService planetaService;
	
	@GetMapping
	public List<Planeta> listaPlaneta() {
		return planetaService.listarTodos();
	}
	
	@PostMapping
	public void salvar(@RequestBody Planeta planeta) {
		planetaService.save(planeta);
	}
	
	@GetMapping(value="/{id}")
	public Planeta buscar(@PathVariable(value="id") String id) {
		return planetaService.getOne(id);
	}
	
	@PutMapping
	public Planeta update(@RequestBody Planeta planeta) {
		return planetaService.save(planeta);
	}
	
	@DeleteMapping()
	public void delete(@RequestBody Planeta planeta) {
		planetaService.delete(planeta);
	}
	
}
