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

import com.umg.basedatosi.entity.Direccion;
import com.umg.basedatosi.repository.Direccion_Repo;

@RestController
@RequestMapping("/Direccion")
@CrossOrigin
public class Direccion_Service{

	@Autowired
    Direccion_Repo direccion;
	
	@GetMapping(path = "/buscar")
	public List<Direccion> getAllDireccion(){
		return direccion.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Direccion saveDireccion(@RequestBody Direccion direccion1) {
		return direccion.save(direccion1);
	
	}	
	
	@DeleteMapping(path = "/eliminar/{cod_direccion}")
	public void deleteDireccion(@PathVariable("cod_direccion") Integer cod_direccion) {
     
		Optional<Direccion> direccio;
		direccio = direccion.findById(cod_direccion);
		if(direccio.isPresent()) {
			direccion.delete(direccio.get());
		}
}
}
