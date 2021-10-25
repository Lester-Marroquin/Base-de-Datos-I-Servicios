package com.umg.basedatosi.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umg.basedatosi.entity.Cliente;

@Repository
public interface Cliente_Repo extends JpaRepository<Cliente, Serializable>{
	

}
