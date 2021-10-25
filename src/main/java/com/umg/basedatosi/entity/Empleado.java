package com.umg.basedatosi.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "empleado")
public class Empleado implements Serializable{

    private static final long serialVersionUID = 13L;
	
	@Id
	@SequenceGenerator(name = "SqcEmpleado",sequenceName = "SQC_EMPLEADO",allocationSize = 1)
	@GeneratedValue(generator = "SqcEmpleado")
    private Integer cod_empleado;
	
	@Column(name = "cod_persona")
	private Integer codPersona;
	
	@Column(name = "fecha_ingreso")
	private String fecha_ingreso;
	
	@Column(name = "cod_emp_empleado")
    private Integer cod_emp_empleado;

	public Integer getCodPersona() {
		return codPersona;
	}

	public void setCodPersona(Integer codPersona) {
		this.codPersona = codPersona;
	}

	public Integer getCod_empleado() {
		return cod_empleado;
	}

	public void setCod_empleado(Integer cod_empleado) {
		this.cod_empleado = cod_empleado;
	}

	public String getFecha_ingreso() {
		return fecha_ingreso;
	}

	public void setFecha_ingreso(String fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}

	public Integer getCod_emp_empleado() {
		return cod_emp_empleado;
	}

	public void setCod_emp_empleado(Integer cod_emp_empleado) {
		this.cod_emp_empleado = cod_emp_empleado;
	}
	
}
