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
@Table(name = "rol")
public class Rol implements Serializable{

    private static final long serialVersionUID = 8L;
	
	@Id
	@SequenceGenerator(name = "SqcRol",sequenceName = "SQC_ROL",allocationSize = 1)
	@GeneratedValue(generator = "SqcRol")
    private Integer cod_rol;
	
	@Column(name = "rol")
    private String rol;
	
	@OneToMany(mappedBy = "codRol")
	private List<Menu_Rol> codrol;
	
	@OneToMany(mappedBy = "codRol")
	private List<Asignar_Rol> asignar;

	public List<Asignar_Rol> getAsignar() {
		return asignar;
	}

	public void setAsignar(List<Asignar_Rol> asignar) {
		this.asignar = asignar;
	}

	public List<Menu_Rol> getCodrol() {
		return codrol;
	}

	public void setCodrol(List<Menu_Rol> codrol) {
		this.codrol = codrol;
	}

	public Integer getCod_rol() {
		return cod_rol;
	}

	public void setCod_rol(Integer cod_rol) {
		this.cod_rol = cod_rol;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}
	
	
}
