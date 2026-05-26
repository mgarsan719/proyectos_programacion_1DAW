package com.daw.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daw.persistence.entities.TareaEntity;
import com.daw.persistence.entities.enums.Estado;
import com.daw.persistence.repositories.TareaRepository;
import com.daw.services.exceptions.TareaException;
import com.daw.services.exceptions.TareaNotFoundException;

@Service
public class TareaService {

	@Autowired
	private TareaRepository tareaRepository;

	// findAll
	public List<TareaEntity> findAll() {
		return this.tareaRepository.findAll();
	}

	// findById
	public TareaEntity findById(long id) {
		if (!this.tareaRepository.existsById(id)) {
			throw new TareaNotFoundException("No se encuentra la tarea con id: " + id);
		}

		return this.tareaRepository.findById(id).get();
	}

	// Create
	public TareaEntity create(TareaEntity t) {
		if (t.getFechaCreacion() != null) {
			throw new TareaException("No se puede modificar la fecha de creación de una tarea. ");
		}
		if (t.getEstado() != null) {
			throw new TareaException("No se puede modificar el estado de una tarea. ");
		}
		if (t.getFechaVencimiento().isBefore(LocalDate.now())) {
			throw new TareaException("La fecha de vencimiento no puede ser anterior a la fecha actual. ");
		}

		t.setId(0);
		t.setFechaCreacion(LocalDate.now());
		t.setEstado(Estado.PENDIENTE);

		return this.tareaRepository.save(t);
	}

	// update
	public TareaEntity update(long id, TareaEntity t) {

		TareaEntity tareaExistente = this.findById(id);

		if (t.getId() != id) {
			throw new TareaNotFoundException("No se encuentra la tarea con id: " + id);
		}

		if (t.getFechaCreacion() != null) {
			throw new TareaException("No se puede modificar la fecha de creación");
		}

		if (t.getEstado() != null) {
			throw new TareaException("No se puede modificar el estado de la tarea");
		}

		if (t.getFechaVencimiento().isBefore(tareaExistente.getFechaCreacion())) {
			throw new TareaException("La fecha de vencimiento no puede ser anterior a la fecha actual. ");
		}

		tareaExistente.setTitulo(t.getTitulo());
		tareaExistente.setDescripcion(t.getDescripcion());
		tareaExistente.setFechaVencimiento(t.getFechaVencimiento());

		return this.tareaRepository.save(tareaExistente);
	}

	// delete
	public void deleteById(long id) {
		
		if (!this.tareaRepository.existsById(id)) {
			throw new TareaNotFoundException("No se encuentra la tarea con id: " + id);
		}
		
		this.tareaRepository.deleteById(id);
	}

	// iniciar tarea
	public TareaEntity iniciarTarea(long id) {
		TareaEntity t = this.findById(id);

		if (!this.tareaRepository.existsById(id)) {
			throw new TareaNotFoundException("No se encuentra la tarea con id: " + id);
		}
		
		if (!t.getEstado().equals(Estado.PENDIENTE)) {
			throw new TareaException("No se puede iniciar una tarea que ya ha sido iniciada. ");
		}

		t.setEstado(Estado.EN_PROGRESO);

		return this.tareaRepository.save(t);
	}

	// completar tarea
	public TareaEntity completarTarea(long id) {
		TareaEntity t = this.findById(id);

		if (!this.tareaRepository.existsById(id)) {
			throw new TareaNotFoundException("No se encuentra la tarea con id: " + id);
		}
		
		if (!t.getEstado().equals(Estado.EN_PROGRESO)) {
			throw new TareaException("No se puede completar una tarea pendiente o que ya ha sido completada. ");
		}

		t.setEstado(Estado.COMPLETADO);

		return this.tareaRepository.save(t);
	}
	
	// obtener tareas pendientes
	public List<TareaEntity> findPendientes() {
		return this.tareaRepository.findByEstado(Estado.PENDIENTE);
	}

	// obtener tareas en progreso
	public List<TareaEntity> findEnProgreso() {
		return this.tareaRepository.findByEstado(Estado.EN_PROGRESO);
	}
	
	// obtener las tareas completadas
	public List<TareaEntity> findCompletadas() {
		return this.tareaRepository.findByEstado(Estado.COMPLETADO);
	}
	
	// obtener las tareas vencidas
	public List<TareaEntity> findVencidas() {
		return this.tareaRepository.findByFechaVencimientoLessThan(LocalDate.now());
	}
	
	// obtener las tareas no vencidas
	public List<TareaEntity> findNoVencidas() {
		return this.tareaRepository.findByFechaVencimientoGreaterThanEqual(LocalDate.now());
	}

	// obtener tareas mediante su título
	public TareaEntity findByTitulo(String titulo) {
		
		List<TareaEntity> tareas = this.tareaRepository.findByTituloContainingIgnoreCase(titulo);
		
		if (tareas.isEmpty()) {
			throw new TareaNotFoundException(String.format("La tarea con título %s no se encuentra.", titulo));
		}

		return tareas.getFirst();
	}
	
	
}