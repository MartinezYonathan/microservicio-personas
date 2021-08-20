package mx.uacm.edu.incidencias.service;

import java.util.List;
import java.util.Optional;

import mx.uacm.edu.incidencias.entity.Persona;

public interface IPersonaService {
	
	public Persona create (Persona persona);
	public List<Persona> getAllPersonas ();
	public void delete (Persona persona);
	public Optional<Persona> findById (Long id);
	
}
