package com.umg.basedatosi.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "ANUNCIO")
public class anuncio implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4852157310646555072L;

	@Id
	@Basic(optional = false)
	@Column(name = "cod_anuncio")
	private Integer cod_anuncio;
	
	@Column(name = "anuncio")
	private String anuncio;
	
	@Column(name = "fecha_inicio")
	private Date fecha_incio;
	
	@Column(name = "fecha_fin")
	private Date fecha_fin;

	public Integer getCod_anuncio() {
		return cod_anuncio;
	}

	public void setCod_anuncio(Integer cod_anuncio) {
		this.cod_anuncio = cod_anuncio;
	}

	public String getAnuncio() {
		return anuncio;
	}

	public void setAnuncio(String anuncio) {
		this.anuncio = anuncio;
	}

	public Date getFecha_incio() {
		return fecha_incio;
	}

	public void setFecha_incio(Date fecha_incio) {
		this.fecha_incio = fecha_incio;
	}

	public Date getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}
		
}
