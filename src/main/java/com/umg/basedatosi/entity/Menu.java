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
@Table(name = "menu")
public class Menu implements  Serializable{

    private static final long serialVersionUID = 7L;
	
	@Id
	@SequenceGenerator(name = "SqcMenu",sequenceName = "SQC_",allocationSize = 1)
	@GeneratedValue(generator = "SqcMenu")
    private Integer cod_menu;
	
	@Column(name = "menu")
    private String menu;
	
	@OneToMany(mappedBy = "codMenu")
	private List<Menu_Rol> menu_rol;

	public List<Menu_Rol> getMenu_rol() {
		return menu_rol;
	}

	public void setMenu_rol(List<Menu_Rol> menu_rol) {
		this.menu_rol = menu_rol;
	}

	public Integer getCod_menu() {
		return cod_menu;
	}

	public void setCod_menu(Integer cod_menu) {
		this.cod_menu = cod_menu;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}
}
