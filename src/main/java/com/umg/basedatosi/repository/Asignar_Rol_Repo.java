package com.umg.basedatosi.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umg.basedatosi.entity.Asignar_Rol;

@Repository
public interface Asignar_Rol_Repo extends JpaRepository<Asignar_Rol, Serializable>{

	          
}
