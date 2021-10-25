package com.umg.basedatosi.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umg.basedatosi.entity.Genero;

@Repository
public interface Genero_Repo extends JpaRepository<Genero, Serializable>{

}
