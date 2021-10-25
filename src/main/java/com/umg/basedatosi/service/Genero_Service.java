package com.umg.basedatosi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.umg.basedatosi.entity.Genero;
import com.umg.basedatosi.repository.Genero_Repo;

@RestController
@RequestMapping("/Genero")
@CrossOrigin
public class Genero_Service{

	@Autowired
	Genero_Repo genero;
	
	@GetMapping(path = "/buscar")
	public List<Genero> getAllGenero(){
		return genero.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Genero saveFactura(@RequestBody Genero genero1) {
		return genero.save(genero1);
	
	}	
	
	@DeleteMapping(path = "/eliminar/{cod_genero}")
	public void deleteGenero(@PathVariable("cod_genero") Integer cod_genero) {
     
		Optional<Genero> gene;
		gene = genero.findById(cod_genero);
		if(gene.isPresent()) {
			genero.delete(gene.get());
		}
}
}











