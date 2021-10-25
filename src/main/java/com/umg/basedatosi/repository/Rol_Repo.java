package com.umg.basedatosi.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umg.basedatosi.entity.Rol;

@Repository
public interface Rol_Repo extends JpaRepository<Rol, Serializable>{

}
