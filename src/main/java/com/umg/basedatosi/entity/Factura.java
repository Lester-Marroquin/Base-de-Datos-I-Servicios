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
@Table(name = "factura")
public class Factura implements  Serializable{

    private static final long serialVersionUID = 20L;
	
	@Id
	@SequenceGenerator(name = "SqcFactura",sequenceName = "SQC_FACTURA",allocationSize = 1)
	@GeneratedValue(generator = "SqcFactura")
    private Integer no_factura;
	
	@Column(name = "cod_sucursal")
	private Integer codSucursal;
	
	@Column(name = "serie")
    private String serie;
	
	@Column(name = "fecha_emision")
    private String fecha_emision;
	
	@Column(name = "cod_cliente")
	private Integer codCliente;
	
	@Column(name = "cod_empleado")
	private Integer codEmpleado;
	
	@Column(name = "cod_estado")
	private Integer codEstado;
	
	@OneToMany(mappedBy = "noFactura")
	private List<Detalle_Factura> detalle;
	
	@OneToMany(mappedBy = "codSucursal")
	private List<Detalle_Factura> detalleS;
	
	@OneToMany(mappedBy = "codEmpleado")
	private List<Detalle_Factura> detalleE;

	public Integer getNo_factura() {
		return no_factura;
	}

	public void setNo_factura(Integer no_factura) {
		this.no_factura = no_factura;
	}

	public Integer getCodSucursal() {
		return codSucursal;
	}

	public void setCodSucursal(Integer codSucursal) {
		this.codSucursal = codSucursal;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getFecha_emision() {
		return fecha_emision;
	}

	public void setFecha_emision(String fecha_emision) {
		this.fecha_emision = fecha_emision;
	}

	public Integer getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(Integer codCliente) {
		this.codCliente = codCliente;
	}

	public Integer getCodEmpleado() {
		return codEmpleado;
	}

	public void setCodEmpleado(Integer codEmpleado) {
		this.codEmpleado = codEmpleado;
	}

	public Integer getCodEstado() {
		return codEstado;
	}

	public void setCodEstado(Integer codEstado) {
		this.codEstado = codEstado;
	}

	public List<Detalle_Factura> getDetalle() {
		return detalle;
	}

	public void setDetalle(List<Detalle_Factura> detalle) {
		this.detalle = detalle;
	}

	public List<Detalle_Factura> getDetalleS() {
		return detalleS;
	}

	public void setDetalleS(List<Detalle_Factura> detalleS) {
		this.detalleS = detalleS;
	}

	public List<Detalle_Factura> getDetalleE() {
		return detalleE;
	}

	public void setDetalleE(List<Detalle_Factura> detalleE) {
		this.detalleE = detalleE;
	}

	
}
