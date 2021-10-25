package com.umg.basedatosi.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "empleado_sucursal")
public class Empleado_Sucursal implements  Serializable{

    private static final long serialVersionUID = 26L;
	
    @Id
    @Column(name = "cod_empleado")
	private Integer codEmpleado;
	
  
	@Column(name = "cod_sucursal")
	private Integer codSucursal;

	@OneToMany(mappedBy = "codEmpleado")
	private List<Factura> factura;
	
	@OneToMany(mappedBy = "codSucursal")
	private List<Factura> factura1;
	
	@OneToMany(mappedBy = "codEmpleado")
	private List<Asignar_Rol> asignar;
	
	@OneToMany(mappedBy = "codSucursal")
	private List<Asignar_Rol> asignar_rol;
	
	@OneToMany(mappedBy = "codempleado1")
	private List<Turno_Empleado> turnoempleado;
	
	@OneToMany(mappedBy = "codsucursal1")
	private List<Turno_Empleado> codsucursal;

	public List<Turno_Empleado> getCodsucursal() {
		return codsucursal;
	}

	public void setCodsucursal(List<Turno_Empleado> codsucursal) {
		this.codsucursal = codsucursal;
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

	public List<Turno_Empleado> getTurnoempleado() {
		return turnoempleado;
	}

	public void setTurnoempleado(List<Turno_Empleado> turnoempleado) {
		this.turnoempleado = turnoempleado;
	}

	

	public List<Asignar_Rol> getAsignar() {
		return asignar;
	}

	public void setAsignar(List<Asignar_Rol> asignar) {
		this.asignar = asignar;
	}

	public List<Asignar_Rol> getAsignar_rol() {
		return asignar_rol;
	}

	public void setAsignar_rol(List<Asignar_Rol> asignar_rol) {
		this.asignar_rol = asignar_rol;
	}

	public List<Factura> getFactura() {
		return factura;
	}

	public void setFactura(List<Factura> factura) {
		this.factura = factura;
	}

	public List<Factura> getFactura1() {
		return factura1;
	}

	public void setFactura1(List<Factura> factura1) {
		this.factura1 = factura1;
	}

	
}
