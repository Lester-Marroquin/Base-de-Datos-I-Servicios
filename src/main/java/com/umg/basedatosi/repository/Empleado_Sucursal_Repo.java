package com.umg.basedatosi.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umg.basedatosi.entity.Empleado_Sucursal;

@Repository
public interface Empleado_Sucursal_Repo extends JpaRepository<Empleado_Sucursal, Serializable>{

}
