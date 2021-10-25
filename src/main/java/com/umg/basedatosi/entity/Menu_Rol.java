package com.umg.basedatosi.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "menu_rol")

public class Menu_Rol implements Serializable{

private static final long serialVersionUID = 9L;

@Id
@Column(name = "cod_menu")
private Integer codMenu;

@Column(name = "cod_rol")
private Integer codRol;


public Integer getCodMenu() {
	return codMenu;
}

public void setCodMenu(Integer codMenu) {
	this.codMenu = codMenu;
}

public Integer getCodRol() {
	return codRol;
}

public void setCodRol(Integer codRol) {
	this.codRol = codRol;
}



	}
	
	