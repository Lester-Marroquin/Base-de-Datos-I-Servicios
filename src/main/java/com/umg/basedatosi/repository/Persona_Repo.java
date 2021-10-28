package com.umg.basedatosi.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umg.basedatosi.entity.Persona;

@Repository

public interface Persona_Repo extends JpaRepository<Persona, Serializable> {
	public List<Persona> findByUsuarioAndContrasenia(String usuario, String contrasenia);
}
