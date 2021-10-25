package com.umg.basedatosi.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umg.basedatosi.entity.Sucursal;

@Repository
public interface Sucursal_Repo extends JpaRepository<Sucursal, Serializable>{

}
