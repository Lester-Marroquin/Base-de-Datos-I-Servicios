package com.umg.basedatosi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.io.Serializable;

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
	private String fecha_inicio;
	
	@Column(name = "fecha_fin")
	private String fecha_fin;

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

	public String getFecha_incio() {
		return fecha_inicio;
	}

	public void setFecha_incio(String fecha_incio) {
		this.fecha_inicio = fecha_incio;
	}

	public String getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(String fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

}
