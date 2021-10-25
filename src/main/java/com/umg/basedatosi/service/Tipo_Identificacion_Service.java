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

import com.umg.basedatosi.entity.Tipo_Identificacion;
import com.umg.basedatosi.repository.Tipo_Identificacion_Repo;

@RestController
@RequestMapping("/TipoIdenti")
@CrossOrigin
public class Tipo_Identificacion_Service {

	@Autowired
	Tipo_Identificacion_Repo tipo;
	
	@GetMapping(path = "/buscar")
	public List<Tipo_Identificacion> getAllTipo(){
		return tipo.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Tipo_Identificacion saveTipo(@RequestBody Tipo_Identificacion tipo1) {
		return tipo.save(tipo1);
	
	}	
	
	@DeleteMapping(path = "/eliminar/{cod_identificacion}")
	public void deleteIdentificacion(@PathVariable("cod_identificacion") Integer cod_identificacion) {
     
		Optional<Tipo_Identificacion> TipoI;
		TipoI = tipo.findById(cod_identificacion);
		if(TipoI.isPresent()) {
			tipo.delete(TipoI.get());
		}
	}
}
