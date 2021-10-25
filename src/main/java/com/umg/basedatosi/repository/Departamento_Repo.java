package com.umg.basedatosi.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umg.basedatosi.entity.Departamento;

@Repository
public interface Departamento_Repo extends JpaRepository<Departamento, Serializable>{
	
	
}
