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
@Table(name = "inventario")
public class Inventario implements  Serializable{

    private static final long serialVersionUID = 21L;
	
	@Id
	@SequenceGenerator(name = "SqcInventario",sequenceName = "SQC_INVENTARIO",allocationSize = 1)
	@GeneratedValue(generator = "SqcInventario")
    private Integer cod_inventario;
	
	@Column(name = "cod_producto")
	private Producto producto;
	
	@Column(name = "cod_sucursal")
	private Sucursal sucursal;
	
	@Column(name = "cantidad")
    private String cantidad;
	
	@Column(name = "precio")
    private Double precio;
	
	@Column(name = "cod_estado")
	private Estado estado;

	@OneToMany(mappedBy = "codInventario")
	private List<Detalle_Factura> inventario;
	
	@OneToMany(mappedBy = "codProducto")
	private List<Detalle_Factura> productof;
	
	public List<Detalle_Factura> getInventario() {
		return inventario;
	}

	public void setInventario(List<Detalle_Factura> inventario) {
		this.inventario = inventario;
	}

	public List<Detalle_Factura> getProductof() {
		return productof;
	}

	public void setProductof(List<Detalle_Factura> productof) {
		this.productof = productof;
	}

	public Integer getCod_inventario() {
		return cod_inventario;
	}

	public void setCod_inventario(Integer cod_inventario) {
		this.cod_inventario = cod_inventario;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
}
