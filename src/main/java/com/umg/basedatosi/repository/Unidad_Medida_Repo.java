package com.umg.basedatosi.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umg.basedatosi.entity.Unidad_Medida;

@Repository
public interface Unidad_Medida_Repo extends JpaRepository<Unidad_Medida, Serializable>{

}
