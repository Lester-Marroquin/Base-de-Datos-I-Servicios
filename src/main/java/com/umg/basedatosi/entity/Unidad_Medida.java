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
@Table(name = "unidad_medida")
public class Unidad_Medida implements  Serializable{

    private static final long serialVersionUID = 15L;
	
	@Id
	@SequenceGenerator(name = "SqcUnidad",sequenceName = "SQC_UNIDAD_MEDIDA",allocationSize = 1)
	@GeneratedValue(generator = "SqcUnidad")
    private Integer cod_unidad_medida;
	
	@Column(name = "unidad_medida")
    private String unidad_medida;
	
	@OneToMany(mappedBy = "codUnidad")
	private List<Producto> producto;

	public List<Producto> getProducto() {
		return producto;
	}

	public void setProducto(List<Producto> producto) {
		this.producto = producto;
	}

	public Integer getCod_unidad_medida() {
		return cod_unidad_medida;
	}

	public void setCod_unidad_medida(Integer cod_unidad_medida) {
		this.cod_unidad_medida = cod_unidad_medida;
	}

	public String getUnidad_medida() {
		return unidad_medida;
	}

	public void setUnidad_medida(String unidad_medida) {
		this.unidad_medida = unidad_medida;
	}
	
}
