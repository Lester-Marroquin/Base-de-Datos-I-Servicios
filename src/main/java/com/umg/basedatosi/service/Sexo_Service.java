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

import com.umg.basedatosi.entity.Sexo;
import com.umg.basedatosi.repository.Sexo_Repo;

@RestController
@RequestMapping("/Sexo")
@CrossOrigin
public class Sexo_Service {

	@Autowired
	Sexo_Repo sexo;
	
	@GetMapping(path = "/buscar")
	public List<Sexo> getAllSexo(){
		return sexo.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Sexo saveSexo(@RequestBody Sexo sexo1) {
		return sexo.save(sexo1);
	}
	
	@DeleteMapping(path = "/eliminar/{cod_sexo}")
	public void deleteSexo(@PathVariable("cod_sexo") Integer cod_sexo) {
     
		Optional<Sexo> sex;
		sex = sexo.findById(cod_sexo);
		if(sex.isPresent()) {
			sexo.delete(sex.get());
		}
}
}