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

import com.umg.basedatosi.entity.Estado;
import com.umg.basedatosi.repository.Estado_Repo;

@RestController
@RequestMapping("/Estado")
@CrossOrigin
public class Estado_service{

	@Autowired
	Estado_Repo estado;
	
	@GetMapping(path = "/buscar")
	public List<Estado> getAllEstado(){
		return estado.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Estado saveEstado(@RequestBody Estado estado1) {
		return estado.save(estado1);
	
	}	
    
	@DeleteMapping(path = "/eliminar/{cod_estado}")
	public void deleteEstado(@PathVariable("cod_estado") Integer cod_estado) {
     
		Optional<Estado> estados;
		estados = estado.findById(cod_estado);
		if(estados.isPresent()) {
			estado.delete(estados.get());
		}
	}
}

















