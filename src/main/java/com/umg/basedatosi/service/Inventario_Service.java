package com.umg.basedatosi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.umg.basedatosi.entity.Inventario;
import com.umg.basedatosi.repository.Inventario_Repo;

@RestController
@RequestMapping("/InventarioService")
@CrossOrigin
public class Inventario_Service {

	@Autowired
	Inventario_Repo inventario;
	
	@GetMapping(path = "/buscar")
	public List<Inventario> getAllInventario(){
		return inventario.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Inventario saveInventario(@RequestBody Inventario inventario1) {
		return inventario.save(inventario1);
	
	}	
	
}
