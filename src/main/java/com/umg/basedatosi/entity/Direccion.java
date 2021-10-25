package com.umg.basedatosi.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "direccion")
public class Direccion implements  Serializable{

    private static final long serialVersionUID = 2L;
	
	@Id
	@SequenceGenerator(name = "SqcDireccion",sequenceName = "SQC_DIRECCION",allocationSize = 1)
	@GeneratedValue(generator = "SqcDireccion")
    private Integer cod_direccion;
	
	@Column(name = "cod_persona")
    private Integer cod_persona;
	
	@Column(name = "direccion")
    private String direccion;

	public Integer getCod_direccion() {
		return cod_direccion;
	}

	public void setCod_direccion(Integer cod_direccion) {
		this.cod_direccion = cod_direccion;
	}

	public Integer getCod_persona() {
		return cod_persona;
	}

	public void setCod_persona(Integer cod_persona) {
		this.cod_persona = cod_persona;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}
