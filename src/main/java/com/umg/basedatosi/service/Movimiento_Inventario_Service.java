package com.umg.basedatosi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.umg.basedatosi.entity.Movimiento_Inventario;
import com.umg.basedatosi.repository.Movimiento_Inventario_Repo;

@RestController
@RequestMapping("/MovimientoInvenario")
@CrossOrigin
public class Movimiento_Inventario_Service {

	@Autowired
    Movimiento_Inventario_Repo movimiento;
	
	@GetMapping(path = "/buscar")
	public List<Movimiento_Inventario> getAllMovimiento(){
		return movimiento.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Movimiento_Inventario saveMovimiento(@RequestBody Movimiento_Inventario movimiento1) {
		return movimiento.save(movimiento1);
	
	}	
	
}
