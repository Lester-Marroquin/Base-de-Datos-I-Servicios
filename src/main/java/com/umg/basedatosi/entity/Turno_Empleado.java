package com.umg.basedatosi.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "turno_empleado")
public class Turno_Empleado implements  Serializable{

    private static final long serialVersionUID = 18L;
	
    @Id
    @Column(name = "cod_turno")
	private Integer turno1;
	
	@Column(name = "cod_empleado")
	private Integer codempleado1;
	
	@Column(name = "cod_sucursal")
	private Integer codsucursal1;


	public Integer getTurno1() {
		return turno1;
	}

	public void setTurno1(Integer turno1) {
		this.turno1 = turno1;
	}

	public Integer getCodempleado1() {
		return codempleado1;
	}

	public void setCodempleado1(Integer codempleado1) {
		this.codempleado1 = codempleado1;
	}

	public Integer getCodsucursal1() {
		return codsucursal1;
	}

	public void setCodsucursal1(Integer codsucursal1) {
		this.codsucursal1 = codsucursal1;
	}

	
	
}










