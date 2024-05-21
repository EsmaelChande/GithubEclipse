package github.word.github.word.api.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import github.word.github.word.api.entities.Pais;
import github.word.github.word.api.repository.RepositoryPais;

@RestController
@RequestMapping(value="/pais")
public class ControllerPais {
	
	@Autowired
	private RepositoryPais repositorio;
	
	
	@GetMapping(path = "/status")
	public String IsOnline() {
		return "APIOnline";
	}
	
	@GetMapping
	public List<Pais> findAll() {
		List<Pais> paises;
		if (repositorio.findAll() != null) {
			paises = repositorio.findAll();
			return paises;
		} else {

			return null;
		}

	}
	
	@GetMapping(value="lista/{id}")
public Pais findById(@PathVariable Integer id) {
	Pais pais;
	if(repositorio.existsById(id)) {
		pais= repositorio.findById(id).get();
		return pais;
	}else {
		return null;
	}
	
	
}
	
	
}
