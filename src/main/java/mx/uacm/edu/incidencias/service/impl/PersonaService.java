package mx.uacm.edu.incidencias.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.uacm.edu.incidencias.entity.Persona;
import mx.uacm.edu.incidencias.repository.PersonaResporitory;
import mx.uacm.edu.incidencias.service.IPersonaService;

@Service
public class PersonaService implements IPersonaService {

	
	@Autowired
	private PersonaResporitory personaResporitory;
	
	@Override
	public Persona create(Persona persona) {
		return personaResporitory.save(persona);
	}

	@Override
	public List<Persona> getAllPersonas() {
		return personaResporitory.findAll();
	}

	@Override
	public void delete(Persona persona) {
		personaResporitory.delete(persona);
	}

	@Override
	public Optional<Persona> findById(Long id) {
		return personaResporitory.findById(id);
	}

}
