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
@Table(name = "tipo_movimiento")
public class Tipo_Movimiento implements  Serializable{

    private static final long serialVersionUID = 16L;
	
	@Id
	@SequenceGenerator(name = "SqcMovimiento",sequenceName = "SQC_TIPO_MOVIMIENTO",allocationSize = 1)
	@GeneratedValue(generator = "SqcMovimiento")
    private Integer cod_movimiento;
	
	@Column(name = "tipo_movimiento")
    private String tipo_movimiento;

	@OneToMany(mappedBy = "tmovimiento")
	private List<Movimiento_Inventario> minventario;
	
	public List<Movimiento_Inventario> getMinventario() {
		return minventario;
	}

	public void setMinventario(List<Movimiento_Inventario> minventario) {
		this.minventario = minventario;
	}

	public Integer getCod_movimiento() {
		return cod_movimiento;
	}

	public void setCod_movimiento(Integer cod_movimiento) {
		this.cod_movimiento = cod_movimiento;
	}

	public String getTipo_movimiento() {
		return tipo_movimiento;
	}

	public void setTipo_movimiento(String tipo_movimiento) {
		this.tipo_movimiento = tipo_movimiento;
	}
	
}
