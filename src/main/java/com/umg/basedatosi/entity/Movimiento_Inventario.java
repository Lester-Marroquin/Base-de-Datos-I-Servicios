package com.umg.basedatosi.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "movimiento_inventario")
public class Movimiento_Inventario implements Serializable{

    private static final long serialVersionUID = 22L;
	
	@Id
	@SequenceGenerator(name = "SqcMInventario",sequenceName = "SQC_MOVIMIENTO_INVENTARIO",allocationSize = 1)
	@GeneratedValue(generator = "SqcMInventario")
    private Integer id_movimiento;
	
	@Column(name = "fecha")
    private String fecha;
	
	@Column(name = "cod_movimiento")
	private Integer tmovimiento;
	
	@Column(name = "cod_producto")
	private Integer producto;
	
	@Column(name = "cantidad")
    private Integer cantidad;
	
	@Column(name = "precio")
    private Integer precio;

	public Integer getId_movimiento() {
		return id_movimiento;
	}

	public void setId_movimiento(Integer id_movimiento) {
		this.id_movimiento = id_movimiento;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Integer getTmovimiento() {
		return tmovimiento;
	}

	public void setTmovimiento(Integer tmovimiento) {
		this.tmovimiento = tmovimiento;
	}

	public Integer getProducto() {
		return producto;
	}

	public void setProducto(Integer producto) {
		this.producto = producto;
	}

	public Integer getCantidad() { 
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	
}
