package com.umg.basedatosi.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "estado")
public class Estado implements  Serializable{

    private static final long serialVersionUID = 14L;
	
	@Id
	@SequenceGenerator(name = "SqcEstado",sequenceName = "SQC_ESTADO",allocationSize = 1)
	@GeneratedValue(generator = "SqcEstado")
    private Integer cod_estado;
	
	@Column(name = "estado")
    private String estado;
	
	@OneToMany(mappedBy = "codEstado")
	private List<Producto> producto;
	
	@OneToMany(mappedBy = "estado")
	private List<Inventario> inventario;
	
	@OneToMany(mappedBy = "codEstado")
	private List<Factura> factura;
	
	public List<Factura> getFactura() {
		return factura;
	}

	public void setFactura(List<Factura> factura) {
		this.factura = factura;
	}

	public List<Inventario> getInventario() {
		return inventario;
	}

	public void setInventario(List<Inventario> inventario) {
		this.inventario = inventario;
	}

	public List<Producto> getProducto() {
		return producto;
	}

	public void setProducto(List<Producto> producto) {
		this.producto = producto;
	}

	public Integer getCod_estado() {
		return cod_estado;
	}

	public void setCod_estado(Integer cod_estado) {
		this.cod_estado = cod_estado;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
