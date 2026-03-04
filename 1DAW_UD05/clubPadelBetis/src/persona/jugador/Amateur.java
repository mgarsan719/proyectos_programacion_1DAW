package persona.jugador;

public class Amateur extends Jugador {

	// ATRIBUTOS
	private String puntoDebil;

	// CONSTRUCTOR
	public Amateur(String nombre, String apellidos, String dni, int codSocio, String puntoDebil) {
		super(nombre, apellidos, dni, codSocio);
		this.puntoDebil = puntoDebil;
	}

	// GETTERS Y SETTERS
	public String getPuntoDebil() {
		return puntoDebil;
	}

	public void setPuntoDebil(String puntoDebil) {
		this.puntoDebil = puntoDebil;
	}

	@Override
	public String toString() {
		return String.format("Profesional [nombre= %s, apellidos= %s, dni=%s, codSocio= %d, puntoDebil= %s]",
				super.getNombre(), super.getApellidos(), super.getDni(), super.getCodSocio(), this.puntoDebil);
	}

	@Override
	public void saludar() {
		System.out.printf("Hola me llamo %s y soy un jugador amateur \n", super.getNombre());
	}
}
