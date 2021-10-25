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
@Table(name = "cliente")
public class Cliente implements  Serializable{

    private static final long serialVersionUID = 24L;
	
	@Id
	@SequenceGenerator(name = "SqcCliente",sequenceName = "SQC_CLIENTE",allocationSize = 1)
	@GeneratedValue(generator = "SqcCliente")
    private Integer cod_cliente;
	
	@Column(name = "cod_persona")
	private Integer codPersona;
	
	@OneToMany(mappedBy = "codCliente")
	private List<Factura> factura;
	
	public Integer getCodPersona() {
		return codPersona;
	}

	public void setCodPersona(Integer codPersona) {
		this.codPersona = codPersona;
	}

	public List<Factura> getFactura() {
		return factura;
	}

	public void setFactura(List<Factura> factura) {
		this.factura = factura;
	}

	public Integer getCod_cliente() {
		return cod_cliente;
	}

	public void setCod_cliente(Integer cod_cliente) {
		this.cod_cliente = cod_cliente;
	}

	
}
