package com.umg.basedatosi.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umg.basedatosi.entity.Tipo_Identificacion;

@Repository
public interface Tipo_Identificacion_Repo extends JpaRepository<Tipo_Identificacion, Serializable>{

}
