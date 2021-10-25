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

import com.umg.basedatosi.entity.Menu;
import com.umg.basedatosi.repository.Menu_Repo;

@RestController
@RequestMapping("/Menu")
@CrossOrigin
public class Menu_Service {

	@Autowired
    Menu_Repo menu;
	
	@GetMapping(path = "/buscar")
	public List<Menu> getAllMenu(){
		return menu.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Menu saveMenu(@RequestBody Menu menu1) {
		return menu.save(menu1);
	
	}	
	
	@DeleteMapping(path = "/eliminar/{cod_menu}")
	public void deleteMenu(@PathVariable("cod_menu") Integer cod_menu) {
     
		Optional<Menu> men;
		men = menu.findById(cod_menu);
		if(men.isPresent()) {
			menu.delete(men.get());
		}
	}
}
