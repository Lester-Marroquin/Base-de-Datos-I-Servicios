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

import com.umg.basedatosi.entity.Telefono;
import com.umg.basedatosi.repository.Telefono_Repo;

@RestController
@RequestMapping("/Telefono")
@CrossOrigin
public class Telefono_Service {

	@Autowired
    Telefono_Repo telefono;
	
	@GetMapping(path = "/buscar")
	public List<Telefono> getAllTelefono(){
		return telefono.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Telefono saveTelefono(@RequestBody Telefono telefono1) {
		return telefono.save(telefono1);
	
	}	
	
	@DeleteMapping(path = "/eliminar/{cod_telefono}")
	public void deleteTelefono(@PathVariable("cod_telefono") Integer cod_telefono) {
     
		Optional<Telefono> telefo;
		telefo = telefono.findById(cod_telefono);
		if(telefo.isPresent()) {
			telefono.delete(telefo.get());
		}
}
}