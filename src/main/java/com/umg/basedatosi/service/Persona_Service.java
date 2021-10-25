package com.umg.basedatosi.service;

import java.util.LinkedList;
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

import com.umg.basedatosi.entity.Cliente;
import com.umg.basedatosi.entity.Direccion;
import com.umg.basedatosi.entity.Empleado;
import com.umg.basedatosi.entity.Telefono;
import com.umg.basedatosi.entity.Persona;
import com.umg.basedatosi.repository.Cliente_Repo;
import com.umg.basedatosi.repository.Direccion_Repo;
import com.umg.basedatosi.repository.Empleado_Repo;
import com.umg.basedatosi.repository.Persona_Repo;
import com.umg.basedatosi.repository.Telefono_Repo;

@RestController
@RequestMapping("/Persona")
@CrossOrigin
public class Persona_Service{

	
	
	@Autowired
	Persona_Repo persona;
	
	@Autowired
	Telefono_Repo telefono;
	
	@Autowired
	Direccion_Repo direccion;
	
	@Autowired
	Cliente_Repo cliente;
	
	@Autowired
	Empleado_Repo empleado;
	
	@GetMapping(path = "/buscar")
	public List<Persona> getAllPersona(){
		return persona.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Persona savePersona(@RequestBody Persona personas) {
		
		List<Telefono> telefonos= personas.getTelefonolists();
		List<Direccion> direccioness= personas.getDireccionlist();
		
		personas.setTelefonolists(null);
		personas.setDireccionlist(null);
		
		personas = persona.save(personas);
		
		personas.setTelefonolists(new LinkedList<>());
		personas.setDireccionlist(new LinkedList<>());
		
		if(telefonos!=null) {
			for(Telefono t: telefonos) {
				t.setCod_persona(personas.getCod_persona());
				telefono.save(t);
				personas.getTelefonolists().add(t);
			}
		}
		
		if(direccioness!=null) {
			for(Direccion d: direccioness) {
				d.setCod_persona(personas.getCod_persona());
				direccion.save(d);
				personas.getDireccionlist().add(d);
			}
		}
		return personas;
	}
	
	@DeleteMapping(path = "/eliminar/{cod_persona}")
	public String deletePersona(@PathVariable("cod_persona") Integer cod_persona) {
    
		Optional<Persona> personas;
		personas = persona.findById(cod_persona);
		if(personas.isPresent()) {
	         Persona borrar = personas.get();
	         for(Cliente t: borrar.getCliente()) {
	        	 cliente.delete(t);
	         }
	         for(Telefono d: borrar.getTelefonolists()) {
	        	 telefono.delete(d);
	         }
	         for(Direccion d: borrar.getDireccionlist()) {
	        	 direccion.delete(d);
	         }
	         for(Empleado d: borrar.getEmpleado()) {
	        	 empleado.delete(d);
	         }
	         
	         persona.delete(personas.get());
		}
		return "BORRADO";
	}
}


