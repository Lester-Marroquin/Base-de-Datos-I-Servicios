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
@Table(name = "producto")
public class Producto implements  Serializable{

    private static final long serialVersionUID = 23L;
	
	@Id
	@SequenceGenerator(name = "SqcProducto",sequenceName = "SQC_PRODUCTO",allocationSize = 1)
	@GeneratedValue(generator = "SqcProducto")
    private Integer cod_producto;
	
	@Column(name = "producto")
    private String producto;
	
	@Column(name = "cod_unidad_medida")
	private Integer codUnidad;
	
	@Column(name = "cod_estado")
	private Integer codEstado;
	
	@OneToMany(mappedBy = "producto")
	private List<Movimiento_Inventario> minventario;
	
	@OneToMany(mappedBy = "producto")
	private List<Inventario> inventario;
	

	public List<Inventario> getInventario() {
		return inventario;
	}

	public void setInventario(List<Inventario> inventario) {
		this.inventario = inventario;
	}

	public List<Movimiento_Inventario> getMinventario() {
		return minventario;
	}

	public void setMinventario(List<Movimiento_Inventario> minventario) {
		this.minventario = minventario;
	}

	public Integer getCod_producto() {
		return cod_producto;
	}

	public void setCod_producto(Integer cod_producto) {
		this.cod_producto = cod_producto;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public Integer getCodUnidad() {
		return codUnidad;
	}

	public void setCodUnidad(Integer codUnidad) {
		this.codUnidad = codUnidad;
	}

	public Integer getCodEstado() {
		return codEstado;
	}

	public void setCodEstado(Integer codEstado) {
		this.codEstado = codEstado;
	}

	
}
