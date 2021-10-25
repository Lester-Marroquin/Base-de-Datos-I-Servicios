package com.umg.basedatosi.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "asignar_rol")
public class Asignar_Rol implements Serializable{

	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cod_rol")
	private Integer codRol;
	
	
	@Column(name = "cod_empleado")
	private Integer codEmpleado;
	
	
	@Column(name = "cod_sucursal")
	private Integer codSucursal;

	public Integer getCodRol() {
		return codRol;
	}

	public void setCodRol(Integer codRol) {
		this.codRol = codRol;
	}

	public Integer getCodEmpleado() {
		return codEmpleado;
	}

	public void setCodEmpleado(Integer codEmpleado) {
		this.codEmpleado = codEmpleado;
	}

	public Integer getCodSucursal() {
		return codSucursal;
	}

	public void setCodSucursal(Integer codSucursal) {
		this.codSucursal = codSucursal;
	}	
	
}