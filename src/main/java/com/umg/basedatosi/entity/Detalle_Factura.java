package com.umg.basedatosi.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "detalle_factura")
public class Detalle_Factura implements  Serializable{

    private static final long serialVersionUID = 19L;
	
	@Id
	@SequenceGenerator(name = "SqcDFactura",sequenceName = "SQC_DETALLE_FACTURA",allocationSize = 1)
	@GeneratedValue(generator = "SqcDFactura")
    private Integer cod_detalle;
	
	@Column(name = "no_factura")
    private Integer noFactura;
	
	@Column(name = "cod_sucursal")
    private Integer codSucursal;
	
	@Column(name = "cod_inventario")
    private Integer codInventario;
	
	@Column(name = "cod_empleado")
    private Integer codEmpleado;
	
	@Column(name = "cod_producto")
    private Integer codProducto;
	
	@Column(name = "INV_cod_sucursal")
    private Integer inv_cod;
	
	@Column(name = "cantidad")
    private Integer cantidad;
	
	@Column(name = "precio")
    private Double precio;

	public Integer getCod_detalle() {
		return cod_detalle;
	}

	public void setCod_detalle(Integer cod_detalle) {
		this.cod_detalle = cod_detalle;
	}

	public Integer getNoFactura() {
		return noFactura;
	}

	public void setNoFactura(Integer noFactura) {
		this.noFactura = noFactura;
	}

	public Integer getCodSucursal() {
		return codSucursal;
	}

	public void setCodSucursal(Integer codSucursal) {
		this.codSucursal = codSucursal;
	}

	public Integer getCodInventario() {
		return codInventario;
	}

	public void setCodInventario(Integer codInventario) {
		this.codInventario = codInventario;
	}

	public Integer getCodEmpleado() {
		return codEmpleado;
	}

	public void setCodEmpleado(Integer codEmpleado) {
		this.codEmpleado = codEmpleado;
	}

	public Integer getCodProducto() {
		return codProducto;
	}

	public void setCodProducto(Integer codProducto) {
		this.codProducto = codProducto;
	}

	public Integer getInv_cod() {
		return inv_cod;
	}

	public void setInv_cod(Integer inv_cod) {
		this.inv_cod = inv_cod;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	
}














