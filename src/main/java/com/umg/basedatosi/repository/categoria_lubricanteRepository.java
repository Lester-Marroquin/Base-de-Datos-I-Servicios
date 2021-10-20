package com.umg.basedatosi.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umg.basedatosi.entity.categoria_lubricante;

@Repository("categoriaLubricanteRepository")
public interface categoria_lubricanteRepository extends JpaRepository<categoria_lubricante, Serializable> {

	public List<categoria_lubricante> findByLubricante(String lubricante);
	
}
