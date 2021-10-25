package com.umg.basedatosi.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "telefono")
public class Telefono implements  Serializable{

    private static final long serialVersionUID = 2L;
	
	@Id
	@SequenceGenerator(name = "SqcTelefono",sequenceName = "SQC_TELEFONO",allocationSize = 1)
	@GeneratedValue(generator = "SqcTelefono")
    private Integer cod_telefono;
	
	@Column(name = "cod_persona")
    private Integer cod_persona;
	
	@Column(name = "telefono")
    private String telefono;

	public Integer getCod_telefono() {
		return cod_telefono;
	}

	public void setCod_telefono(Integer cod_telefono) {
		this.cod_telefono = cod_telefono;
	}

	public Integer getCod_persona() {
		return cod_persona;
	}

	public void setCod_persona(Integer cod_persona) {
		this.cod_persona = cod_persona;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
}
