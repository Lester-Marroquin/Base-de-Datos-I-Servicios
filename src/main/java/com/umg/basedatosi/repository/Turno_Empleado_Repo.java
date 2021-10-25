package com.umg.basedatosi.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umg.basedatosi.entity.Turno_Empleado;

@Repository
public interface Turno_Empleado_Repo extends JpaRepository<Turno_Empleado, Serializable>{

}
