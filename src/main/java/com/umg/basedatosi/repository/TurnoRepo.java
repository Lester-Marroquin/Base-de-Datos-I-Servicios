package com.umg.basedatosi.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umg.basedatosi.entity.Turno;

@Repository
public interface TurnoRepo extends JpaRepository<Turno, Serializable>{

}
