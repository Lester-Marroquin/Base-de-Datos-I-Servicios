package com.umg.basedatosi.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umg.basedatosi.entity.categoria_combustible;

@Repository("categoriaCombustibleRepository")
public interface categoria_combustibleRepository extends JpaRepository<categoria_combustible, Serializable>{

	public List<categoria_combustible> findByCombustible(String combustible);
	
}
