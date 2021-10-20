package com.umg.basedatosi.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CATEGORIA_COMBUSTIBLE")
public class categoria_combustible implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7916042652290372364L;

	@Id
	@Basic(optional = false)
	@Column(name = "cod_combustible")
	private Integer cod_combustible;
	
	@Column(name = "combustible")
	private String combustible;

	public Integer getCod_combustible() {
		return cod_combustible;
	}

	public void setCod_combustible(Integer cod_combustible) {
		this.cod_combustible = cod_combustible;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}
	
}
