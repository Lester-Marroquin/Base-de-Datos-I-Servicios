package com.umg.basedatosi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.umg.basedatosi.entity.Turno_Empleado;
import com.umg.basedatosi.repository.Turno_Empleado_Repo;

@RestController
@RequestMapping("/TurnoEmpleado")
@CrossOrigin
public class Turno_Empleado_Service {

	@Autowired
	Turno_Empleado_Repo  turno;
	
	@GetMapping(path = "/buscar")
	public List<Turno_Empleado> getAllTurno(){
		return turno.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Turno_Empleado saveTurno(@RequestBody Turno_Empleado turno1) {
		return turno.save(turno1);
	
	}	
}
