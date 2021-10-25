package com.umg.basedatosi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.umg.basedatosi.entity.Empleado_Sucursal;
import com.umg.basedatosi.repository.Empleado_Sucursal_Repo;

@RestController
@RequestMapping("/EpleadoSucursal")
@CrossOrigin
public class Empleado_Sucursal_Service {

	@Autowired
	Empleado_Sucursal_Repo emsucursal;
	
	@GetMapping(path = "/buscar")
	public List<Empleado_Sucursal> getAllEmpleado(){
		return emsucursal.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Empleado_Sucursal saveEmpleado(@RequestBody Empleado_Sucursal empleado1) {
		return emsucursal.save(empleado1);
	
	}	
	
	
}
