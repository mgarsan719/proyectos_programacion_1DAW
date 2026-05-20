package com.daw.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daw.persistence.entities.TareaEntity;
import com.daw.services.TareaService;
import com.daw.services.exceptions.TareaException;
import com.daw.services.exceptions.TareaNotFoundException;

@RestController
@RequestMapping("/tareas")
public class TareaController {

	@Autowired
	private TareaService tareaService;

	// findAll
	@GetMapping
	public ResponseEntity<List<TareaEntity>> list() {
		return ResponseEntity.ok(this.tareaService.findAll());
	}

	// findById
	@GetMapping("/{id}")
	public ResponseEntity<?> findById(@PathVariable long id) {
		try {
			return ResponseEntity.ok(this.tareaService.findById(id));
		} catch (TareaNotFoundException ex) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
		}
	}

	// create
	@PostMapping
	public ResponseEntity<?> create(@RequestBody TareaEntity tareaEntity) {
		try {
			return ResponseEntity.status(HttpStatus.CREATED).body(this.tareaService.create(tareaEntity));
		} catch (TareaException ex) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
		}
	}

	// update
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@PathVariable long id, @RequestBody TareaEntity tareaEntity) {
		try {
			return ResponseEntity.ok(this.tareaService.update(id, tareaEntity));

		} catch (TareaNotFoundException ex) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
		} catch (TareaException ex) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
		}
	}

	// delete
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable long id) {
		try {
			this.tareaService.deleteById(id);
			return ResponseEntity.ok().build();
		} catch (TareaNotFoundException ex) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
		}
	}

	// iniciar tarea
	@PutMapping("/iniciarTarea/{id}")
	public ResponseEntity<?> iniciarTarea(@PathVariable long id) {
		try {
			return ResponseEntity.ok(this.tareaService.iniciarTarea(id));
		} catch(TareaNotFoundException ex) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
		} catch(TareaException ex) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
		}
	}

	// completar tarea
	@PutMapping("/completarTarea/{id}")
	public ResponseEntity<?> completarTarea(@PathVariable long id) {
		try {
			return ResponseEntity.ok(this.tareaService.completarTarea(id));
		} catch(TareaNotFoundException ex) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
		} catch(TareaException ex) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
		}
	}
	
	// obtener tareas pendientes

	// obtener tareas en progreso

	// obtener las tareas completadas

	// obtener las tareas vencidas

	// obtener las tareas no vencidas

	// obtener tareas mediante su título
}