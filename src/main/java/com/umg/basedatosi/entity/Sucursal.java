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
@Table(name = "sucursal")
public class Sucursal implements  Serializable{

    private static final long serialVersionUID = 12L;
	
	@Id
	@SequenceGenerator(name = "SqcSucursal",sequenceName = "SQC_SUCURSAL",allocationSize = 1)
	@GeneratedValue(generator = "SqcSucursal")
    private Integer cod_sucursal;
	
	@Column(name = "cod_municipio")
	private Integer municipio;
	
	@Column(name = "nombre_sucursal")
    private String nombre_sucursal;
	
	@OneToMany(mappedBy = "codSucursal")
	private List<Empleado_Sucursal> empleado_sucursal;
	
	@OneToMany(mappedBy = "sucursal")
	private List<Inventario> inventario;
	
	public List<Inventario> getInventario() {
		return inventario;
	}

	public void setInventario(List<Inventario> inventario) {
		this.inventario = inventario;
	}

	public List<Empleado_Sucursal> getEmpleado_sucursal() {
		return empleado_sucursal;
	}

	public void setEmpleado_sucursal(List<Empleado_Sucursal> empleado_sucursal) {
		this.empleado_sucursal = empleado_sucursal;
	}

	public Integer getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Integer municipio) {
		this.municipio = municipio;
	}

	public Integer getCod_sucursal() {
		return cod_sucursal;
	}

	public void setCod_sucursal(Integer cod_sucursal) {
		this.cod_sucursal = cod_sucursal;
	}

	public String getNombre_sucursal() {
		return nombre_sucursal;
	}

	public void setNombre_sucursal(String nombre_sucursal) {
		this.nombre_sucursal = nombre_sucursal;
	}
	
}
