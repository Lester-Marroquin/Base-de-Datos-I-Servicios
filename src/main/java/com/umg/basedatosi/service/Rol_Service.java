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

import com.umg.basedatosi.entity.Rol;
import com.umg.basedatosi.repository.Rol_Repo;

@RestController
@RequestMapping("/Rol")
@CrossOrigin
public class Rol_Service {

	@Autowired
	Rol_Repo rol;
	
	@GetMapping(path = "/buscar")
	public List<Rol> getAllRol(){
		return rol.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Rol saveRol(@RequestBody Rol rol1) {
		return rol.save(rol1);
	
	}
	
	@DeleteMapping(path = "/eliminar/{cod_rol}")
	public void deleteRol(@PathVariable("cod_rol") Integer cod_rol) {
     
		Optional<Rol> rols;
		rols = rol.findById(cod_rol);
		if(rols.isPresent()) {
			rol.delete(rols.get());
		}
	}
}
