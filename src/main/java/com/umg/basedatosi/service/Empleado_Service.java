package com.umg.basedatosi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.umg.basedatosi.entity.Empleado;
import com.umg.basedatosi.repository.Empleado_Repo;

@RestController
@RequestMapping("/Epleado")
@CrossOrigin
public class Empleado_Service{

	@Autowired
    Empleado_Repo empleado;
	
	@GetMapping(path = "/buscar")
	public List<Empleado> getAllEmpleado(){
		return empleado.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Empleado saveEmpleado(@RequestBody Empleado empleado1) {
		return empleado.save(empleado1);
	
	}	
	
    
}
