package com.umg.basedatosi.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umg.basedatosi.entity.Movimiento_Inventario;

@Repository
public interface Movimiento_Inventario_Repo extends JpaRepository<Movimiento_Inventario, Serializable>{

}
