package persona.jugador;

import java.util.Objects;

public class Profesional extends Jugador {

	// ATRIBUTOS
	private String puntoFuerte;

	// CONSTRUCTOR
	public Profesional(String nombre, String apellidos, String dni, int codSocio, String puntoFuerte) {
		super(nombre, apellidos, dni, codSocio);
		this.puntoFuerte= puntoFuerte;
	}

	// GETTERS Y SETTERS
	public String getPuntoFuerte() {
		return puntoFuerte;
	}

	public void setPuntoFuerte(String puntoFuerte) {
		this.puntoFuerte = puntoFuerte;
	}

	@Override
	public int hashCode() {
		return Objects.hash(puntoFuerte);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profesional other = (Profesional) obj;
		return super.equals(obj) && this.puntoFuerte.equals(other.puntoFuerte);
	}

	@Override
	public String toString() {
		return String.format("Profesional [nombre= %s, apellidos= %s, dni=%s, codSocio= %d, puntoFuerte= %s]",
				super.getNombre(), super.getApellidos(), super.getDni(), super.getCodSocio(), this.puntoFuerte);
	}

	@Override
	public void saludar() {
		System.out.printf("Hola me llamo %s y soy profesional \n", super.getNombre());
	}

}
