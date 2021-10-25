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

import com.umg.basedatosi.entity.Tipo_Movimiento;
import com.umg.basedatosi.repository.Tipo_Movimiento_Repo;

@RestController
@RequestMapping("/Tmovimiento")
@CrossOrigin
public class Tipo_Movimiento_Service {

	@Autowired
	Tipo_Movimiento_Repo Tmovimiento;
	
	@GetMapping(path = "/buscar")
	public List<Tipo_Movimiento> getAllMovimiento(){
		return Tmovimiento.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Tipo_Movimiento saveMovimiento(@RequestBody Tipo_Movimiento movimiento1) {
		return Tmovimiento.save(movimiento1);
	
	}
	
	@DeleteMapping(path = "/eliminar/{cod_movimiento}")
	public void deleteEstado(@PathVariable("cod_movimiento") Integer cod_movimiento) {
     
		Optional<Tipo_Movimiento> movimiento;
		movimiento = Tmovimiento.findById(cod_movimiento);
		if(movimiento.isPresent()) {
			Tmovimiento.delete(movimiento.get());
		}
	}
}
