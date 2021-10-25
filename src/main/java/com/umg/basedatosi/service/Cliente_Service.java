package com.umg.basedatosi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.umg.basedatosi.entity.Cliente;
import com.umg.basedatosi.repository.Cliente_Repo;

@RestController
@RequestMapping("/Cliente")
@CrossOrigin
public class Cliente_Service {

	@Autowired
    Cliente_Repo cliente;
	
	@GetMapping(path = "/buscar")
	public List<Cliente> getAllCliente(){
		return cliente.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Cliente saveCliente(@RequestBody Cliente cliente1) {
		return cliente.save(cliente1);
	
	}	
}
