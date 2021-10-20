package com.umg.basedatosi.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CATEGORIA_LUBRICANTE")
public class categoria_lubricante implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4204592193687472773L;

	@Id
	@Basic(optional = false)
	@Column(name = "cod_lubricante")
	private Integer cod_lubricante;
	
	@Column(name = "lubricante")
	private String lubricante;

	public Integer getCod_lubricante() {
		return cod_lubricante;
	}

	public void setCod_lubricante(Integer cod_lubricante) {
		this.cod_lubricante = cod_lubricante;
	}

	public String getLubricante() {
		return lubricante;
	}

	public void setLubricante(String lubricante) {
		this.lubricante = lubricante;
	}
	
}
