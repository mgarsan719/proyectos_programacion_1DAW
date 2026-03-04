package instalaciones;

import java.time.LocalDateTime;
import java.util.List;

import persona.empleado.Empleado;
import persona.jugador.Jugador;

public class Partido {

	private static int contador = 1;

	// ATRIBUTOS
	private int codigo;
	private Pista pista;
	private int numJugadores;
	private List<Jugador> jugadores;
	private LocalDateTime fechaFirmaEmpleado;
	private LocalDateTime fechaFirmaJugador;
	private Empleado empleadoResponsable;

	// CONSTRUCTOR
	public Partido(int codigo, Pista pista, int numJugadores, LocalDateTime fechaFirmaEmpleado,
			LocalDateTime fechaFirmaJugador, Empleado empledoResponsable) {

		this.codigo = Partido.contador++;
		this.pista = pista;
		this.numJugadores = numJugadores;
		this.fechaFirmaEmpleado = fechaFirmaEmpleado;
		this.fechaFirmaJugador = fechaFirmaJugador;
		this.empleadoResponsable = empledoResponsable;

	}

	// GETTERS Y SETTERS
	public int getCodigo() {
		return codigo;
	}

	public Pista getPista() {
		return pista;
	}

	public int getNumJugadores() {
		return numJugadores;
	}

	public LocalDateTime getFechaFirmaEmpleado() {
		return fechaFirmaEmpleado;
	}

	public LocalDateTime getFechaFirmaJugador() {
		return fechaFirmaJugador;
	}

	public Empleado getEmpleadoResponsable() {
		return empleadoResponsable;
	}

	public void setPista(Pista pista) {
		this.pista = pista;
	}

	public void setNumJugadores(int numJugadores) {
		this.numJugadores = numJugadores;
	}

	public void setFechaFirmaEmpleado(LocalDateTime fechaFirmaEmpleado) {
		this.fechaFirmaEmpleado = fechaFirmaEmpleado;
	}

	public void setFechaFirmaJugador(LocalDateTime fechaFirmaJugador) {
		this.fechaFirmaJugador = fechaFirmaJugador;
	}

	public void setEmpleadoResponsable(Empleado empledoResponsable) {
		this.empleadoResponsable = empledoResponsable;
	}

	public boolean completo() {
		return this.jugadores.size() == this.numJugadores;
	}

	public String estado() {
		String estado = "PENDIENTE";

		if (this.fechaFirmaJugador != null && this.fechaFirmaEmpleado != null) {

			estado = "CONFIRMADO";
		}

		else if (this.fechaFirmaJugador != null) {

			estado = "RESERVADO";
		}

		return estado;
	}

	public void asociarJugador(Jugador j) {

		if (completo()) {
			throw new IllegalArgumentException("El partido está completo");
		}

		this.jugadores.add(j);
	}

	public void eliminarJugador(int pos) {

		if (pos < 0 || pos >= this.jugadores.size() || this.jugadores.size() == 0) {

			throw new IllegalArgumentException("No se puede eliminar al jugador de la posicion" + pos);
		}

		this.jugadores.remove(pos);
	}

	public void reservar() {

		if (!completo()) {

			throw new IllegalArgumentException("Faltan jugadores por asignar");
		}

		if (this.fechaFirmaJugador != null) {

			throw new IllegalArgumentException("Los jugadores ya han reservado");
		}

		this.fechaFirmaJugador = LocalDateTime.now();
	}

	public void reservar(Empleado e) {

		if (!completo()) {

			throw new IllegalArgumentException("Faltan jugadores por asignar");
		}

		if (this.fechaFirmaJugador == null) {

			throw new IllegalArgumentException("Los jugadores no han reservado aún");
		}

		if (this.fechaFirmaEmpleado != null) {

			throw new IllegalArgumentException(
					"Ya está reservado por el empleado con codigo" + this.empleadoResponsable.getCodEmpleado());
		}

		this.empleadoResponsable = e;
		this.fechaFirmaJugador = LocalDateTime.now();
	}
	
}
