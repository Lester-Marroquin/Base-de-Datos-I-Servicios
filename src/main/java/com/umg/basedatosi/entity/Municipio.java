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
@Table(name = "municipio")
public class Municipio implements  Serializable{

    private static final long serialVersionUID = 11L;
	
	@Id
	@SequenceGenerator(name = "SqcMunicipio",sequenceName = "SQC_MUNICIPIO",allocationSize = 1)
	@GeneratedValue(generator = "SqcMunicipio")
    private Integer cod_municipio;
	
	@Column(name = "cod_departamento")
	private Integer cod_departamento;

	@Column(name = "departamento")
    private String departamento;
	
	@OneToMany(mappedBy = "municipio")
	private List<Sucursal> municipio;
	
	public List<Sucursal> getMunicipio() {
		return municipio;
	}

	public void setMunicipio(List<Sucursal> municipio) {
		this.municipio = municipio;
	}

	public Integer getCod_municipio() {
		return cod_municipio;
	}

	public void setCod_municipio(Integer cod_municipio) {
		this.cod_municipio = cod_municipio;
	}


	public Integer getCod_departamento() {
		return cod_departamento;
	}

	public void setCod_departamento(Integer cod_departamento) {
		this.cod_departamento = cod_departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
}
