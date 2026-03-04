package instalaciones;

public class Pista implements Reservable {

	// ATRIBUTOS
	private int numPista;
	private TipoPista tipo;
	private Ubicacion ubi;

	private boolean reservada;

	// CONSTRUCTOR
	public Pista(int numPista, String tipo, String ubi) {
		this.setNumPista(numPista);
		this.setTipo(tipo);
		this.setUbi(ubi);
		this.reservada = false;
	}

	// GETTERS Y SETTERS
	public int getNumPista() {
		return numPista;
	}

	public String getTipo() {
		return tipo.toString();
	}

	public String getUbi() {
		return ubi.toString();
	}

	public boolean isReservada() {
		return reservada;
	}

	public void setNumPista(int numPista) {
		if (numPista < 0) {
			throw new IllegalArgumentException("El numero de pista debe ser entero positivo");
		}
		this.numPista = numPista;
	}

	public void setTipo(String tipo) {
		this.tipo = TipoPista.valueOf(tipo);
	}

	public void setUbi(String ubi) {
		this.ubi = Ubicacion.valueOf(ubi);
	}

	// METODOS
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pista other = (Pista) obj;
		return numPista == other.numPista && this.tipo.equals(other.tipo) && this.ubi.equals(other.ubi);
	}

	@Override
	public String toString() {
		return String.format("Pista [numPista= %d, Tipo= %s, Ubicacion= %s]", this.numPista, this.getTipo(),
				this.getUbi());
	}

	@Override
	public void reservar() {

		if (this.reservada) {
			throw new IllegalStateException("La pista ya está reservada");
		}

		this.reservada = true;
	}

	@Override
	public void anular() {


		if (!this.reservada) {
			throw new IllegalStateException("La pista no está reservada");
		}
		
		this.reservada = false;
	}

}
