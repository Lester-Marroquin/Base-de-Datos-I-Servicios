package com.umg.basedatosi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.io.Serializable;
import java.util.Calendar;

@Entity
@Table(name = "ANUNCIO")
public class anuncio implements Serializable{

	private static final long serialVersionUID = 33;

	@Id
	@SequenceGenerator(name = "SqcAnuncio",sequenceName = "SQC_ANUNCIO",allocationSize = 1)
	@GeneratedValue(generator = "SqcAnuncio")
	private Integer cod_anuncio;
	
	@Column(name = "anuncio")
	private String anuncio;
	
	@Column(name = "fecha_inicio")
	@Temporal(TemporalType.DATE)
	private Calendar fecha_inicio;
	
	@Column(name = "fecha_fin")
	@Temporal(TemporalType.DATE)
	private Calendar fecha_fin;

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

	public Calendar getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(Calendar fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public Calendar getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(Calendar fecha_fin) {
		this.fecha_fin = fecha_fin;
	}


}
