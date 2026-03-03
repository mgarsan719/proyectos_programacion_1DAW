package persona.jugador;

import persona.Persona;

public abstract class Jugador extends Persona {

	// ATRIBUTOS
	private int codSocio;

	public Jugador(String nombre, String apellidos, String dni, int codSocio) {
		super(nombre, apellidos, dni);
		this.codSocio = codSocio;
	}

	// GETTERS Y SETTERS
	public int getCodSocio() {
		return codSocio;
	}

	public void setCodSocio(int codSocio) {
		this.codSocio = codSocio;
	}

	// METODOS
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		return super.equals(obj) && this.codSocio == other.codSocio;
	}

	@Override
	public String toString() {
		return String.format("Jugador [nombre= %s, apellidos= %s, dni=%s, codSocio= %d]", super.getNombre(),
				super.getApellidos(), super.getDni(), this.codSocio);
	}

}
