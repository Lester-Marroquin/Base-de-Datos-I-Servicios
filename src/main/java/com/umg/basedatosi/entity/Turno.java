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
@Table(name = "turno")
public class Turno implements  Serializable{

    private static final long serialVersionUID = 17L;
	
	@Id
	@SequenceGenerator(name = "SqcTurno",sequenceName = "SQC_TURNO",allocationSize = 1)
	@GeneratedValue(generator = "SqcTurno")
    private Integer cod_turno;
	
	@Column(name = "turno")
    private String turno;

	@OneToMany(mappedBy = "turno1")
	private List<Turno_Empleado> turnoEmp;
	
	public List<Turno_Empleado> getTurnoEmp() {
		return turnoEmp;
	}

	public void setTurnoEmp(List<Turno_Empleado> turnoEmp) {
		this.turnoEmp = turnoEmp;
	}

	public Integer getCod_turno() {
		return cod_turno;
	}

	public void setCod_turno(Integer cod_turno) {
		this.cod_turno = cod_turno;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
	
}
