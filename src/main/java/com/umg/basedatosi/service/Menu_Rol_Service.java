package com.umg.basedatosi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.umg.basedatosi.entity.Menu_Rol;
import com.umg.basedatosi.repository.Menu_Rol_Repo;

@RestController
@RequestMapping("/MenuRol")
@CrossOrigin
public class Menu_Rol_Service{

	@Autowired
	Menu_Rol_Repo menu;
	
	@GetMapping(path = "/buscar")
	public List<Menu_Rol> getAllMenu(){
		return menu.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Menu_Rol saveMenu(@RequestBody Menu_Rol menu1) {
		return menu.save(menu1);
	
	}	

}
