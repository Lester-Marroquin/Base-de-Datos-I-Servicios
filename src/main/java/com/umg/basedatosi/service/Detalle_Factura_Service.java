package com.umg.basedatosi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.umg.basedatosi.entity.Detalle_Factura;
import com.umg.basedatosi.repository.Detalle_Factura_Repo;

@RestController
@RequestMapping("/DetalleFactura")
@CrossOrigin
public class Detalle_Factura_Service {

	@Autowired
	Detalle_Factura_Repo detalle;
	
	@GetMapping(path = "/buscar")
	public List<Detalle_Factura> getAllDetalle(){
		return detalle.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Detalle_Factura saveDetalle(@RequestBody Detalle_Factura detalle1) {
		return detalle.save(detalle1);
	}
	
}
