package com.umg.basedatosi.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_identificacion")
public class Tipo_Identificacion implements  Serializable{

    private static final long serialVersionUID = 5L;
	
	@Id
	@SequenceGenerator(name = "SqcIdentificacion",sequenceName = "SQC_TIPO_IDENTIFICACION",allocationSize = 1)
	@GeneratedValue(generator = "SqcIdentificacion")
    private Integer cod_identificacion;
	
	@Column(name = "tipo_identificacion")
    private String tipo_identificacion;
	
	@OneToMany(mappedBy = "identificacion")
	private List<Persona> tipoident;

	public List<Persona> getTipoident() {
		return tipoident;
	}

	public void setTipoident(List<Persona> tipoident) {
		this.tipoident = tipoident;
	}

	public Integer getCod_identificacion() {
		return cod_identificacion;
	}

	public void setCod_identificacion(Integer cod_identificacion) {
		this.cod_identificacion = cod_identificacion;
	}

	public String getTipo_identificacion() {
		return tipo_identificacion;
	}

	public void setTipo_identificacion(String tipo_identificacion) {
		this.tipo_identificacion = tipo_identificacion;
	}
	
}
