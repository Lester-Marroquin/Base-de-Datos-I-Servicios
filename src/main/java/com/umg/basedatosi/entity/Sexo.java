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
@Table(name = "sexo")
public class Sexo implements  Serializable{

    private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name = "SqcSexo",sequenceName = "SQC_SEXO",allocationSize = 1)
	@GeneratedValue(generator = "SqcSexo")
    private Integer cod_sexo;
	
	@Column(name = "sexo")
    private String sexo;
	
	@OneToMany(mappedBy = "sexo")
	private List<Persona> sexopersona;

	public List<Persona> getSexopersona() {
		return sexopersona;
	}

	public void setSexopersona(List<Persona> sexopersona) {
		this.sexopersona = sexopersona;
	}

	public Integer getCod_sexo() {
		return cod_sexo;
	}

	public void setCod_sexo(Integer cod_sexo) {
		this.cod_sexo = cod_sexo;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}
