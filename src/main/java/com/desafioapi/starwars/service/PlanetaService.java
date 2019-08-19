package com.desafioapi.starwars.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafioapi.starwars.model.Planeta;
import com.desafioapi.starwars.repository.PlanetaRepository;

@Service
public class PlanetaService {
	
	@Autowired
	PlanetaRepository planetaRepository;
	
	public List<Planeta> listarTodos() {
		return planetaRepository.findAll();
	}

	public Planeta save(Planeta planeta) {
		return planetaRepository.save(planeta);
		
	}

	public Planeta getOne(String id) {
		return planetaRepository.getOne(id);
	}

	public void delete(Planeta planeta) {
		planetaRepository.delete(planeta);
	}
}
