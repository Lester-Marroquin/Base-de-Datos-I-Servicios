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
@Table(name = "departamento")
public class Departamento implements  Serializable{

    private static final long serialVersionUID = 10L;
	
	@Id
	@SequenceGenerator(name = "SqcDepartamento",sequenceName = "SQC_DEPARTAMENTO",allocationSize = 1)
	@GeneratedValue(generator = "SqcDepartamento")
    private Integer cod_departamento;
	
	@Column(name = "departamento")
    private String departamento;
	
	@OneToMany(mappedBy = "cod_departamento")
	private List<Municipio> cod_municipio;	

	public Integer getCod_departamento() {
		return cod_departamento;
	}

	public void setCod_departamento(Integer cod_departamento) {
		this.cod_departamento = cod_departamento;
	}

	public List<Municipio> getCod_departamentos() {
		return cod_municipio;
	}

	public void setCod_departamentos(List<Municipio> cod_departamento) {
		this.cod_municipio = cod_departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
}
