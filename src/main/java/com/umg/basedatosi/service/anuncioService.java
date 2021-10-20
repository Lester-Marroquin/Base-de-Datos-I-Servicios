package com.umg.basedatosi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.umg.basedatosi.entity.anuncio;
import com.umg.basedatosi.repository.anuncioRepository;

@RestController
@RequestMapping("/anuncio")
@CrossOrigin
public class anuncioService {

	@Autowired
	anuncioRepository AnuncioRepositorio;
	
	@GetMapping(path = "/buscar")
	public List<anuncio> getAllAnuncio(){
		return AnuncioRepositorio.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public anuncio saveAnuncio(@RequestBody anuncio Anuncio) {
		return AnuncioRepositorio.save(Anuncio);
	}
	
}
