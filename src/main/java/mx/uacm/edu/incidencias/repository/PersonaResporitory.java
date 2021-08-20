package mx.uacm.edu.incidencias.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.uacm.edu.incidencias.entity.Persona;

@Repository
public interface PersonaResporitory extends JpaRepository<Persona, Long>{

}