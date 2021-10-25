package com.umg.basedatosi.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umg.basedatosi.entity.Detalle_Factura;

@Repository
public interface Detalle_Factura_Repo extends JpaRepository<Detalle_Factura, Serializable>{

}
