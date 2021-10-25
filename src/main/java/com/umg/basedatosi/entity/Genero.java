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
@Table(name = "genero")
public class Genero implements  Serializable{

    private static final long serialVersionUID = 4L;
	
	@Id
	@SequenceGenerator(name = "SqcGenero",sequenceName = "SQC_GENERO",allocationSize = 1)
	@GeneratedValue(generator = "SqcGenero")
    private Integer cod_genero;
	
	@Column(name = "genero")
    private String genero;

	@OneToMany(mappedBy = "genero")
	private List<Persona> generopersona;
	
	public List<Persona> getGeneropersona() {
		return generopersona;
	}

	public void setGeneropersona(List<Persona> generopersona) {
		this.generopersona = generopersona;
	}

	public Integer getCod_genero() {
		return cod_genero;
	}

	public void setCod_genero(Integer cod_genero) {
		this.cod_genero = cod_genero;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
}
