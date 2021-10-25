package com.umg.basedatosi.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umg.basedatosi.entity.Menu_Rol;

@Repository
public interface Menu_Rol_Repo extends JpaRepository<Menu_Rol, Serializable>{

}
