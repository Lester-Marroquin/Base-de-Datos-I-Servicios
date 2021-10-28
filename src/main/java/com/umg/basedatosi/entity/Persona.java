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
@Table(name = "persona")
public class Persona implements  Serializable{

    private static final long serialVersionUID = 6L;
	
	@Id
	@SequenceGenerator(name = "SqcPersona",sequenceName = "SQC_PERSONA",allocationSize = 1)
	@GeneratedValue(generator = "SqcPersona")
    private Integer cod_persona;
	
	@Column(name = "no_identificacion")
	private String Noidentificacion;
	
	@Column(name = "cod_identificacion")
	private Integer identificacion;
	
	@Column(name = "cod_sexo")
	private Integer sexo;
	
	@Column(name = "cod_genero")
	private Integer genero;
	
	@Column(name = "nombre_1")
    private String nombre_1;
	
	@Column(name = "nombre_2")
    private String nombre_2;
	
	@Column(name = "apellido_1")
    private String apellido_1;
	
	@Column(name = "apellido_2")
    private String apellido_2;
	
	@Column(name = "apellido_casada")
    private String apellido_casada;
	
	@Column(name = "fecha_nacimiento")
    private String fecha_nacimiento;
	
	@OneToMany(mappedBy = "cod_persona")
	private List<Direccion> direccionlist;
	
	@OneToMany(mappedBy = "cod_persona")
	private List<Telefono> telefonolists;

	@OneToMany(mappedBy = "codPersona")
	private List<Empleado> empleado;
	
	@OneToMany(mappedBy = "codPersona")
	private List<Cliente> cliente;

	public Integer getCod_persona() {
		return cod_persona;
	}

	public void setCod_persona(Integer cod_persona) {
		this.cod_persona = cod_persona;
	}

	public String getNoidentificacion() {
		return Noidentificacion;
	}

	public void setNoidentificacion(String noidentificacion) {
		Noidentificacion = noidentificacion;
	}

	public Integer getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(Integer identificacion) {
		this.identificacion = identificacion;
	}

	public Integer getSexo() {
		return sexo;
	}

	public void setSexo(Integer sexo) {
		this.sexo = sexo;
	}

	public Integer getGenero() {
		return genero;
	}

	public void setGenero(Integer genero) {
		this.genero = genero;
	}

	public String getNombre_1() {
		return nombre_1;
	}

	public void setNombre_1(String nombre_1) {
		this.nombre_1 = nombre_1;
	}

	public String getNombre_2() {
		return nombre_2;
	}

	public void setNombre_2(String nombre_2) {
		this.nombre_2 = nombre_2;
	}

	public String getApellido_1() {
		return apellido_1;
	}

	public void setApellido_1(String apellido_1) {
		this.apellido_1 = apellido_1;
	}

	public String getApellido_2() {
		return apellido_2;
	}

	public void setApellido_2(String apellido_2) {
		this.apellido_2 = apellido_2;
	}

	public String getApellido_casada() {
		return apellido_casada;
	}

	public void setApellido_casada(String apellido_casada) {
		this.apellido_casada = apellido_casada;
	}

	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public List<Direccion> getDireccionlist() {
		return direccionlist;
	}

	public void setDireccionlist(List<Direccion> direccionlist) {
		this.direccionlist = direccionlist;
	}

	public List<Telefono> getTelefonolists() {
		return telefonolists;
	}

	public void setTelefonolists(List<Telefono> telefonolists) {
		this.telefonolists = telefonolists;
	}

	public List<Empleado> getEmpleado() {
		return empleado;
	}

	public void setEmpleado(List<Empleado> empleado) {
		this.empleado = empleado;
	}

	public List<Cliente> getCliente() {
		return cliente;
	}

	public void setCliente(List<Cliente> cliente) {
		this.cliente = cliente;
	}

	
	
	
}
