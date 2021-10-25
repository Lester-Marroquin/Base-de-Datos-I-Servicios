package com.umg.basedatosi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.umg.basedatosi.entity.Asignar_Rol;
import com.umg.basedatosi.repository.Asignar_Rol_Repo;

@RestController
@RequestMapping("/AsignarRol")
@CrossOrigin
public class Asignar_Rol_Service {

	@Autowired
	Asignar_Rol_Repo Asignar;
	
	@GetMapping(path = "/buscar")
	public List<Asignar_Rol> getAllAsignar(){
		return Asignar.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Asignar_Rol saveAsignar(@RequestBody Asignar_Rol asignar) {
		return Asignar.save(asignar);
	}
	
}
