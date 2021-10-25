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

import com.umg.basedatosi.entity.Detalle_Factura;
import com.umg.basedatosi.entity.Factura;
import com.umg.basedatosi.repository.Detalle_Factura_Repo;
import com.umg.basedatosi.repository.Factura_Repo;

@RestController
@RequestMapping("/Factura")
@CrossOrigin
public class Factura_Service {

	@Autowired
	Factura_Repo factura;
	
	@Autowired
	Detalle_Factura_Repo detall;
	
	@GetMapping(path = "/buscar")
	public List<Factura> getAllFactura(){
		return factura.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Factura saveFactura(@RequestBody Factura facturas) {
		
		List<Detalle_Factura> detalle= facturas.getDetalle();
		
		facturas.setDetalle(null);
		
		facturas = factura.save(facturas);
		
		facturas.setDetalle(new LinkedList<>());
		
		
		if(detalle!=null) {
			for(Detalle_Factura t: detalle) {
				t.setNoFactura(facturas.getNo_factura());
				detall.save(t);
				facturas.getDetalle().add(t);
			}
		}
		
		return facturas;
	}
	
	@DeleteMapping(path = "/eliminar/{no_factura}")
	public String deleteFactura(@PathVariable("no_factura") Integer no_factura) {
    
		Optional<Factura> facturas;
		facturas = factura.findById(no_factura);
		if(facturas.isPresent()) {
	         Factura borrar = facturas.get();
	         for(Detalle_Factura t: borrar.getDetalle()) {
	        	 detall.delete(t);
	         }
	         
	         factura.delete(facturas.get());
		}
		return "BORRADO";
	}
	
}













